package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Annotation usage in Java:
 * @Component("thatSillyCoach") == bean id
 * @Scope("prototype") - create a new instance every time
 * Default Scope is SINGLETON
 */
@Component("tennisCoach")
//@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
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

    //define my init method
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff");
    }

    //define my destroy method
    public void doMyCleanupStuff() {
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff");
    }

    //getters
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";

    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
