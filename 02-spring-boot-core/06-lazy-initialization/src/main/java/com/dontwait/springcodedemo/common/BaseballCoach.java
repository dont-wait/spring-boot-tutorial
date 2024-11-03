package com.dontwait.springcodedemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice baseball for 30 minutes!";
    }
    public BaseballCoach() {
        System.out.println("In constructor: " + getClass().getName());
    }
}
