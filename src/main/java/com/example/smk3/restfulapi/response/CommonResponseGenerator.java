package com.example.smk3.restfulapi.response;

import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class CommonResponseGenerator<T> {

    public <T> CommonResponse<T> successResponse(T response, String message) {
        CommonResponse commonResponse = new CommonResponse<>();
        commonResponse.setStatus("200");
        commonResponse.setMessage(message);
        commonResponse.setResponse(response);

        return commonResponse;
    }

    public <T> CommonResponse<T> failedResponse(String message) {
        CommonResponse commonResponse = new CommonResponse<>();
        commonResponse.setStatus("400");
        commonResponse.setMessage(message);

        return commonResponse;
    }

    public <T> CommonResponse<T> successResponse(String message) {
        CommonResponse commonResponse = new CommonResponse<>();
        commonResponse.setStatus("200");
        commonResponse.setMessage(message);

        return commonResponse;
    }

}
