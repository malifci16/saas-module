package com.wave.tech.saas.config;

import com.wave.tech.saas.interceptor.RestTemplateInterceptor;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author mohamed.abdelsalam
 */
@Configuration
public class RestTemplateConfig {

    private final RestTemplateInterceptor restTemplateInterceptor;
    private final RestTemplateErrorHandler responseErrorHandler;

    @Autowired
    public RestTemplateConfig(RestTemplateInterceptor restTemplateInterceptor,
            RestTemplateErrorHandler responseErrorHandler) {
        this.restTemplateInterceptor = restTemplateInterceptor;
        this.responseErrorHandler = responseErrorHandler;
    }

    @Bean
    public RestTemplate getRestTemplate() {
        RestTemplate restTemplate
                = new RestTemplate(getBufferingClientRequestFactory());
        restTemplate
                .setMessageConverters(
                        Collections.singletonList(getJacksonMessageConverter()));
        restTemplate.setInterceptors(Collections.singletonList(restTemplateInterceptor));
        restTemplate.setErrorHandler(this.responseErrorHandler);
        return restTemplate;
    }

    private BufferingClientHttpRequestFactory getBufferingClientRequestFactory() {
        return new BufferingClientHttpRequestFactory(
                new SimpleClientHttpRequestFactory());
    }

    private MappingJackson2HttpMessageConverter getJacksonMessageConverter() {
        return new MappingJackson2HttpMessageConverter();
    }

}
