package com.cryolite;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.cryolite")
public class AppConfig {
    /*
    @Bean
    public Phone getPhone()
    {
        return new Phone();
    }

    @Bean
    public Processor getProcessor()
    {
        return new SubProcessorOne();
    }
     */
}
