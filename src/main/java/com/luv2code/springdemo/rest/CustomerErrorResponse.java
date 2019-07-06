package com.luv2code.springdemo.rest;


public class CustomerErrorResponse {
    private int status;
    private String message;
    private long timestmap;

    public CustomerErrorResponse() {
    }

    public CustomerErrorResponse(int status, String message, long timestmap) {
        this.status = status;
        this.message = message;
        this.timestmap = timestmap;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestmap() {
        return timestmap;
    }

    public void setTimestmap(long timestmap) {
        this.timestmap = timestmap;
    }
}
