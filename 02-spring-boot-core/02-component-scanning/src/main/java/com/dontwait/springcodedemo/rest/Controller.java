package com.dontwait.springcodedemo.rest;

import com.dontwait.springcodedemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    //define a private field

    //field injection
    @Autowired
    private Coach myCoach;

    //constructor injection
//    private Coach myCoach;
//    @Autowired
//    public Controller(Coach theCoach) {
//        myCoach = theCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
