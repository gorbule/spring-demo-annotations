package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        //read spring java config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from the spring container
//        Coach theCoach = context.getBean("swimCoach", Coach.class);
        Coach theCoach = context.getBean("swimCoach", SwimCoach.class);

        //cal a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method to get the DailyFortune
        System.out.println(theCoach.getDailyFortune());

        //call our new swim coach methods ... has the props values injected
        System.out.println("Coach email: " + ((SwimCoach) theCoach).getEmail());
        System.out.println("Coach team name: " + ((SwimCoach) theCoach).getTeam());

        //close container
        context.close();

    }
}
