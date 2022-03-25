package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Annotation usage in Java:
 * @Component("thatSillyCoach") == bean id
 */
@Component("tennisCoach")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    //constructor for Constructor Injection. Example available also for FootballCoach class
        //    @Autowired
        //    public TennisCoach(FortuneService theFortuneService) {
        //        fortuneService = theFortuneService;
        //    }

    //constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

//    //setter method for FortuneService. must be @Autowired - to be available for dependency injection
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println(">> TennisCoach: inside setFortuneService");
//        this.fortuneService = fortuneService;
//    }
//
//    //Method Injection Example
//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//        System.out.println(">> TennisCoach: inside doSomeCrazyStuff");
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";

    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
