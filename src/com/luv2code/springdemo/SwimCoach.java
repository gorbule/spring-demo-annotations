package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    //constructor
    public SwimCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    //getters
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
