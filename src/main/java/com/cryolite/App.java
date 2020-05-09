package com.cryolite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        Logger logger = LoggerFactory.getLogger(App.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextConfiguration.xml");
        logger.info("Spring Application Start Point 1. exec");
        logger.info("______________________________________");
        Parent obj = (Parent)context.getBean(ChildA.class);
        Parent obj1 = (Parent)context.getBean(ChildB.class);
        obj1.trigger();
        logger.info(Arrays.toString(context.getBeanNamesForType(ChildA.class)));
        obj.trigger();

        SubChild subChild = (SubChild)context.getBean(SubChild.class);
        logger.info(subChild.toString());
    }

}

