// TODO:
//1. Read on ClassPath in Spring.

package com.cryolite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        Logger logger = LoggerFactory.getLogger(App.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextConfiguration.xml");
        logger.info("Spring Application Start Point 1. exec");
        logger.info("______________________________________");
        Parent obj = (Parent)context.getBean("Parent");
        obj.trigger();
    }
}

// Dependency Injection:
// 1. getBean is used to procure the desired bean. getBean is provided by spring which allows the use of either
// BeanFactory or ApplicationContext interface to use the method getBean.

// 2. ApplicationContext of type ClassPathXMLApplicationContext has been used to fetch the bean for Vehicle class.
// The constructor argument of ClassPathXMLApplicationContext receives a string with the name of xml file containing the
// bean configuration. i.e when getBeans is called with a name then which class object should be returned.

// 3. The bean configuration file should be placed in resources folder. Since ClassPathXMLApplicationContext looks for
// configuration file inside the src/main/resources folder by default.

// Configurations in Spring are possible in three ways: 1. XML 2. Annotation Based 3. Java Configurations
