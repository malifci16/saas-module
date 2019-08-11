package com.wave.tech.saas.exception;

import java.io.IOException;
import org.springframework.http.HttpStatus;

/**
 *
 * @author mohamed.abdelsalam
 */
public class ServerException extends IOException {

    public ServerException(String errorMessage, HttpStatus httpStatus) {
        super(errorMessage);
        this.errorMessage = errorMessage;
        this.httpStatus = httpStatus;
    }

    private String errorMessage;
    private HttpStatus httpStatus;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
