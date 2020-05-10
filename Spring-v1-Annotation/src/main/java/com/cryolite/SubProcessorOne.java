package com.cryolite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubProcessorOne implements Processor {
    Logger logger = LoggerFactory.getLogger(SubProcessorOne.class);
    public void process(){
        logger.info("SubProcessorOne: Process Triggered.");
    }
}
