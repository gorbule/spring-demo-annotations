package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

/**
 * Annotation usage in Java:
 * @Component("thatSillyCoach") == bean id
 */
@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";

    }
}
