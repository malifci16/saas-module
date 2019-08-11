package com.wave.tech.saas.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * @author mohamed.abdelsalam
 */
@ControllerAdvice
public class AdviceErrorHandler
        extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value
            = {BusinessException.class})
    protected ResponseEntity<Object> handleBusinessException(
            BusinessException ex, WebRequest request) {
        String bodyOfResponse = ex.getErrorMessage();
        return handleExceptionInternal(ex, bodyOfResponse,
                this.buildHttpHeaders(), ex.getHttpStatus(), request);
    }

    @ExceptionHandler(value
            = {ServerException.class})
    protected ResponseEntity<Object> handleServerException(
            ServerException ex, WebRequest request) {
        String bodyOfResponse = ex.getErrorMessage();
        return handleExceptionInternal(ex, bodyOfResponse,
                this.buildHttpHeaders(), ex.getHttpStatus(), request);
    }

    private HttpHeaders buildHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }
}
