package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class FotballCoach implements Coach {

    private  FortuneService fortuneService;

    @Autowired
    public FotballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;

    }

    @Override
    public String getDailyWorkout() {
        return "Run 3 km";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
