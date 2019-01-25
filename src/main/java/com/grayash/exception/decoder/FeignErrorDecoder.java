package com.grayash.exception.decoder;

import java.io.IOException;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;

import com.grayash.exception.FeignCustomException;

import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;

public class FeignErrorDecoder implements ErrorDecoder {

	private final ErrorDecoder defaultErrorDecoder = new Default();

    
    public Exception decode(String methodKey, Response response) {
        if (response.status() >= 400 && response.status() <= 499) {
            try {
                byte[] bodyData = Util.toByteArray(response.body().asInputStream());
                String data = new String(bodyData);
                JSONObject responseBody = new JSONObject(data);
                FeignCustomException feignException = new FeignCustomException();
                feignException.setResponseMsg(responseBody.getString("responseMsg"));
                feignException.setResponseCode(responseBody.getString("responseCode"));
                feignException.setHttpCode(HttpStatus.valueOf(responseBody.getString("httpCode")));
                return feignException;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return defaultErrorDecoder.decode(methodKey, response);
    }
}
