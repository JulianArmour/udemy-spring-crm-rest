package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CustomerErrorResponse> handleCustomerError(CustomerNotFoundException e) {
        CustomerErrorResponse m = new CustomerErrorResponse();
        m.setMessage(e.getMessage());
        m.setStatus(HttpStatus.NOT_FOUND.value());
        m.setTimestmap(System.currentTimeMillis());
        return new ResponseEntity<>(m, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<CustomerErrorResponse> genericException(RuntimeException e) {
        CustomerErrorResponse m = new CustomerErrorResponse();
        m.setMessage("Bad Request");
        m.setStatus(HttpStatus.BAD_REQUEST.value());
        m.setTimestmap(System.currentTimeMillis());
        return new ResponseEntity<>(m, HttpStatus.BAD_REQUEST);
    }
}
