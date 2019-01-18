package com.github.grayash.exception;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class OTPExpiredException extends PCRuntimeException{

    private static final Logger Log = LoggerFactory.getLogger(OTPExpiredException.class);



    public OTPExpiredException(String customerId){
        super(customerId);
        if(Log.isErrorEnabled())
            Log.error("Throwing OTPExpiredException");
    }


}
