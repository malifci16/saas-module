/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wave.tech.saas.wrapper;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author mohamed.abdelsalam
 */
@Component
public abstract class SassCustomWrapper {

    @Value("${etisalat.saas.service.url}")
    private String serviceUrl;
    @Value("${etisalat.saas.service.username}")
    private String serviceUserName;
    @Value("${etisalat.saas.service.password}")
    private String servicePassword;

    @Autowired
    private RestTemplate restTemplate;

    public RestTemplate getRestTemplate() {
        return this.restTemplate;
    }

    public URI getServiceUri(String methodName) throws URISyntaxException {
        return new URI(new StringBuilder(this.serviceUrl).append(methodName).toString());
    }

    public HttpEntity<Object> getRequestEntity(Object requestEntity) {
        return new HttpEntity(requestEntity, this.getAuthenticationHeader());
    }

    public boolean isValidResponseEntity(ResponseEntity responseEntity) {
        return responseEntity.getStatusCode().equals(HttpStatus.OK);
    }

    private HttpHeaders getAuthenticationHeader() {
        return new HttpHeaders() {
            {
                String auth = serviceUserName + ":" + servicePassword;
                byte[] encodedAuth = Base64.encodeBase64(
                        auth.getBytes(Charset.forName("US-ASCII")));
                String authHeader = "Basic " + new String(encodedAuth);
                set("Authorization", authHeader);
            }
        };
    }

}
