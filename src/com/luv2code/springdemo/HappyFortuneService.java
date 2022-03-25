package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//let's use @Components annotation... Spring can register it
@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "It is you lucky Day!";
    }
}
