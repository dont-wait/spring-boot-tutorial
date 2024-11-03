package com.dontwait.springcodedemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice cricket for 15 minutes!!!!";
    }

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getName());
    }
}
