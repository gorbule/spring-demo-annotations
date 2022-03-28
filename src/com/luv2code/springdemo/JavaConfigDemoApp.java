package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {

        //read spring java config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from the spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //cal a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method to get the DailyFortune
        System.out.println(theCoach.getDailyFortune());

        //close container
        context.close();

    }
}
