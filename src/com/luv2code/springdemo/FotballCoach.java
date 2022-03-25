package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class FotballCoach implements Coach {

    //Field Injection example
    @Autowired
    private  FortuneService fortuneService;

    public FotballCoach() {
        System.out.println(">> FotballCoach: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Run 3 km :D ";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
