package com.github.grayash.exception;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class PCRuntimeException extends RuntimeException {

    private static final Logger Log = LoggerFactory.getLogger(PCRuntimeException.class);

    private String customerId;

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


}
