package com.grayash.exception;

import org.springframework.http.HttpStatus;

public class FeignCustomException extends PCRuntimeException{

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
}
