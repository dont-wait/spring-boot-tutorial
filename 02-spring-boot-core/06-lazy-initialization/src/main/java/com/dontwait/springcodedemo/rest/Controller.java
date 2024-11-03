package com.dontwait.springcodedemo.rest;

import com.dontwait.springcodedemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    //define a private field
    private final Coach myCoach;

    @Autowired
    public Controller(@Qualifier("baseballCoach") Coach coach) {
        System.out.println("In constructor: " + getClass().getName());
        myCoach = coach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
