package com.cryolite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChildB implements Parent{
    Logger logger  = LoggerFactory.getLogger(ChildB.class);
    public void trigger()
    {
        logger.info("Sub ChildB - Trigger Method.");
    }
}
