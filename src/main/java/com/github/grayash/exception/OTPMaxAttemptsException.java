package com.github.grayash.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OTPMaxAttemptsException extends PCRuntimeException{

    private static final Logger Log = LoggerFactory.getLogger(OTPMaxAttemptsException.class);


    public OTPMaxAttemptsException(){
        super();
        if(Log.isErrorEnabled())
            Log.error("Throwing OtpNotGeneratedException");
    }
}
