package com.wave.tech.saas.interceptor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

/**
 *
 * @author mohamed.abdelsalam
 */
@Component
public class RestTemplateInterceptor implements ClientHttpRequestInterceptor {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        traceRequest(request, body);
        ClientHttpResponse response = execution.execute(request, body);
        traceResponse(response);
        return response;
    }

    private void traceRequest(HttpRequest request, byte[] body) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("===========================Outgoing Request Begin=============================================").append("\n");
        stringBuilder.append("URI         : ").append(request.getURI()).append("\n");
        stringBuilder.append("Method      : ").append(request.getMethod()).append("\n");
        stringBuilder.append("Headers     : ").append(request.getHeaders()).append("\n");
        stringBuilder.append("Request body: ").append(new String(body, "UTF-8")).append("\n");
        stringBuilder.append("==========================Outgoing Request End================================================");
        logger.debug(stringBuilder.toString());
    }

    private void traceResponse(ClientHttpResponse response) throws IOException {
        try {
            StringBuilder inputStringBuilder = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.getBody(), "UTF-8"));
            String line = bufferedReader.readLine();
            while (line != null) {
                inputStringBuilder.append(line);
                inputStringBuilder.append('\n');
                line = bufferedReader.readLine();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("============================Incoming Response Begin==========================================").append("\n");
            stringBuilder.append("Status code  : ").append(response.getStatusCode()).append("\n");
            stringBuilder.append("Status text  : ").append(response.getStatusText()).append("\n");
            stringBuilder.append("Headers      : ").append(response.getHeaders()).append("\n");
            stringBuilder.append("Response body: ").append(inputStringBuilder.toString()).append("\n");
            stringBuilder.append("=======================Incoming Response End=================================================");
            logger.debug(stringBuilder.toString());
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }
}
