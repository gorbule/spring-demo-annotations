package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Java Configuration File. Spring Config without XML.
 * Added Components Scanning Support @Component("packageToScan")
 */
@Configuration
//@Component("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    //Define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    //define bean for our swim coach AND inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
