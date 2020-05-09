package com.cryolite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChildA implements Parent{
    Logger logger = LoggerFactory.getLogger(ChildA.class);

    @Autowired
    private SubChild subChild;

    public SubChild getSubChild() {
        return subChild;
    }

    public void setSubChild(SubChild subChild) {
        this.subChild = subChild;
    }

    public void trigger()
     {
         subChild.setIndex("Trial by Fire");
       logger.info("Child A - Trigger. " + subChild);
     }
}
