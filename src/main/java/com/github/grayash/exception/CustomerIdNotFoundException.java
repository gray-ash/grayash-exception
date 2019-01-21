package com.github.grayash.exception;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class CustomerIdNotFoundException extends PCRuntimeException{

    private static final Logger Log = LoggerFactory.getLogger(CustomerIdNotFoundException.class);



    public CustomerIdNotFoundException(){
        super();
        if(Log.isErrorEnabled())
            Log.error("Throwing CustomerIdNotFoundException");
    }



}
