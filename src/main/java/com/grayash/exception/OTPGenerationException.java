package com.grayash.exception;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class OTPGenerationException extends PCRuntimeException{

    private static final Logger Log = LoggerFactory.getLogger(OTPGenerationException.class);


    public OTPGenerationException(){
        super();
        if(Log.isErrorEnabled())
            Log.error("Throwing OtpNotGeneratedException");
    }
}
