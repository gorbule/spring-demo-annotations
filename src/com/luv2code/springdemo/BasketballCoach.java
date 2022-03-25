package com.luv2code.springdemo;

public class BasketballCoach implements Coach {

    public FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
