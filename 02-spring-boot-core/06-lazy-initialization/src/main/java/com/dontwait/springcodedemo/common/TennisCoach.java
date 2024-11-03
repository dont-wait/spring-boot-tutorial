package com.dontwait.springcodedemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice tennis for 10 minutes!";
    }

    public TennisCoach() {
        System.out.println("In constructor: " + getClass().getName());
    }
}
