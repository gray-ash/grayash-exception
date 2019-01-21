package com.github.grayash.exception;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class InvalidOTPException extends PCRuntimeException{

    private static final Logger Log = LoggerFactory.getLogger(InvalidOTPException.class);
    private int count=0;



    public InvalidOTPException(){
        super();

        if(Log.isErrorEnabled())
            Log.error("Throwing OTPNotMatchException");
    }
    
    public InvalidOTPException(int count){
        super();
        this.count = count;
    }

    public void setOtpErrorCount(int count){
        this.count = count;
    }

    public int getOtpErrorCount(){
        return this.count;
    }
}
