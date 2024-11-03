package com.dontwait.springcore;

import org.springframework.stereotype.Component;

public class SmsService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
