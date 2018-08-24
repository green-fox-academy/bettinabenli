package com.greenfoxacademy.groot.models;

@Component
public class ErrorMessage extends RestResponse {

    private String error;

    public ErrorMessage() {
    }

    public ErrorMessage(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
