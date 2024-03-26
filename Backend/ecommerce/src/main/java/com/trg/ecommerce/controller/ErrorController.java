package com.trg.ecommerce.controller;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.trg.ecommerce.exception.ApiException;
import com.trg.ecommerce.exception.ResourceNotFoundException;
import com.trg.ecommerce.payload.error.ApiError;

@RestControllerAdvice
public class ErrorController {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiError> resourceNotFoundHandler(ResourceNotFoundException ex, WebRequest request) {
        ApiError apiError = new ApiError(ex.getMessage(), new Date(), request.getDescription(false));
        return ResponseEntity.status(404).body(apiError);
    }

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ApiError> apiExceptionHandler(ApiException ex, WebRequest request) {
        ApiError apiError = new ApiError(ex.getMessage(), new Date(), request.getDescription(false));
        return ResponseEntity.status(ex.getHttpStatus()).body(apiError);
    }
}
