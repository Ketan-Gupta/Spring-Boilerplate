package com.cryolite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class Phone {

    @Autowired
    Processor processor;
    Logger logger = LoggerFactory.getLogger(Phone.class);

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void config(){
        logger.info("Configuration Triggered.");
        processor.process();
    }
}
