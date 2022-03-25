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
//        Coach theCoach = context.getBean("thatSillyCoach", Coach.class); - ERROR, cause of incorrect bean name. Compare this line with TennisCoach class @Component



        //cal a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //close container
        context.close();

    }
}
