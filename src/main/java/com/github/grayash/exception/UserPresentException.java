package com.github.grayash.exception;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class UserPresentException extends PCRuntimeException {

    private static final Logger Log = LoggerFactory.getLogger(UserPresentException.class);



    public UserPresentException(){
        super();
        if(Log.isErrorEnabled())
            Log.error("Throwing UserPresentException");

    }
}
