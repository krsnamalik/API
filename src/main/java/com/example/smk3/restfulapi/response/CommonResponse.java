package com.example.smk3.restfulapi.response;

public class CommonResponse<T> {
    private String status;
    private String message;
    private T response;

    public CommonResponse() {
    }

    public CommonResponse(String status, String message, T response) {
        this.status = status;
        this.message = message;
        this.response = response;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }
}
