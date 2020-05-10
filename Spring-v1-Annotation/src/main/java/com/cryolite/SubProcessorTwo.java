package com.cryolite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SubProcessorTwo implements Processor{
    Logger logger = LoggerFactory.getLogger(SubProcessorTwo.class);
    public void process(){
            logger.info("SubProcessorTwo - Process Triggered");
    }
}
