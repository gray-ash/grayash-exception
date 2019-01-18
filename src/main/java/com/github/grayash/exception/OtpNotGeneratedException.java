package com.github.grayash.exception;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class OtpNotGeneratedException extends PCRuntimeException{

    private static final Logger Log = LoggerFactory.getLogger(OtpNotGeneratedException.class);


    public OtpNotGeneratedException(String customerId){
        super(customerId);
        if(Log.isErrorEnabled())
            Log.error("Throwing OtpNotGeneratedException");
    }
}
