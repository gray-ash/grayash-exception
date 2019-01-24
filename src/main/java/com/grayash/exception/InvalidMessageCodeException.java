package com.grayash.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvalidMessageCodeException extends PCRuntimeException{
	
	
	private static final Logger Log = LoggerFactory.getLogger(InvalidMessageCodeException.class);



    public InvalidMessageCodeException(){
        super();
        if(Log.isErrorEnabled())
            Log.error("Throwing InvalidMessageCodeException");
    }


}
