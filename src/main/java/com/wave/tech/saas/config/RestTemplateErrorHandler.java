package com.wave.tech.saas.config;

import com.google.gson.JsonObject;
import com.wave.tech.saas.exception.BusinessException;
import com.wave.tech.saas.exception.ServerException;
import com.wave.tech.saas.util.JsonUtils;
import java.io.IOException;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

/**
 *
 * @author mohamed.abdelsalam
 */
@Component
public class RestTemplateErrorHandler implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse httpResponse)
            throws IOException {
        if (!httpResponse.getStatusCode().equals(HttpStatus.OK)) {
            return true;
        }
        JsonObject responseJson = JsonUtils.getJsonObject(httpResponse.getBody());
        return responseJson.has("error");
    }

    @Override
    public void handleError(ClientHttpResponse httpResponse)
            throws IOException {
        if (!httpResponse.getStatusCode().equals(HttpStatus.OK)) {
            throw new ServerException("Error while trying to get data from etisalat saas service", httpResponse.getStatusCode());
        } else {
            JsonObject responseJson = JsonUtils.getJsonObject(httpResponse.getBody());
            throw new BusinessException(responseJson.toString(), HttpStatus.BAD_REQUEST);
        }
    }

}
