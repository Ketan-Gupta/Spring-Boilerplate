package com.cryolite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ChildA implements Parent{
    Logger logger = LoggerFactory.getLogger(ChildA.class);

    public void trigger()
     {
       logger.info("Sub Child A - Trigger");
     }
}
