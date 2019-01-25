package com.grayash.exception.decoder;

import java.io.Serializable;

import org.springframework.http.HttpStatus;


public class Status implements Serializable {

    private String responseCode;
    private String responseMsg;
    private HttpStatus httpCode;


    public String getResponseCode() {
		return responseCode;
	}


	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}


	public String getResponseMsg() {
		return responseMsg;
	}


	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}


	public HttpStatus getHttpCode() {
		return httpCode;
	}


	public void setHttpCode(HttpStatus httpCode) {
		this.httpCode = httpCode;
	}


	public Status(){

    }


    public Status(String responseCode, String responseMsg, HttpStatus httpCode){
        this.responseCode = responseCode;
        this.responseMsg = responseMsg;
        this.httpCode = httpCode;
    }

}
