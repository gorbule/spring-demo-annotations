package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from the spring container
//        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

        //tennisCoach - default bean id
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
//        Coach theCoach2 = context.getBean("thatSillyCoach", Coach.class);
//        Coach theCoach3 = context.getBean("thatSillyCoach", Coach.class);
//!!!! Coach theCoach = context.getBean("thatSillyCoach", Coach.class); - ERROR, cause of incorrect bean name. Compare this line with TennisCoach class @Component

        //cal a method on the bean
        System.out.println(theCoach.getDailyWorkout());
//        System.out.println(theCoach2.getDailyWorkout());
//        System.out.println(theCoach3.getDailyWorkout());

        //call method to get the DailyFortune
        System.out.println(theCoach.getDailyFortune());
//        System.out.println(theCoach2.getDailyFortune());
//        System.out.println(theCoach3.getDailyFortune());


        //close container
        context.close();

    }
}
