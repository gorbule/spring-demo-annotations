package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Annotation usage in Java:
 * @Component("thatSillyCoach") == bean id
 */
@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    //constructor
    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";

    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
