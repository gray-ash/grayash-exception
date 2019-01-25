package com.grayash.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

public abstract class PCRuntimeException extends RuntimeException {

    private static final Logger Log = LoggerFactory.getLogger(PCRuntimeException.class);

    private String customerId;
    private String responseCode;
    private String responseMsg;
    private HttpStatus httpCode;

    public String getCustomerId() {
        return customerId;
    }

    public PCRuntimeException(String customerId){
        super();
        this.customerId = customerId;
        if(Log.isErrorEnabled())
            Log.error("Throwing PCRuntimeException");
    }
    
    
    public PCRuntimeException(){
        super();
        if(Log.isErrorEnabled())
            Log.error("Throwing PCRuntimeException");
    }

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
