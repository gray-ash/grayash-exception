package com.grayash.exception;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class OTPExpiredException extends PCRuntimeException{

    private static final Logger Log = LoggerFactory.getLogger(OTPExpiredException.class);



    public OTPExpiredException(){
        super();
        if(Log.isErrorEnabled())
            Log.error("Throwing OTPExpiredException");
    }


}
