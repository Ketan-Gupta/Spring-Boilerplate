package com.cryolite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Phone {

    @Autowired
    @Qualifier("subProcessorTwo")
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
