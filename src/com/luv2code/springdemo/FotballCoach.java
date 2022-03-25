package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class FotballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run 3 km";
    }
}
