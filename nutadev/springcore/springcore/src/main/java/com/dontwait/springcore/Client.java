package com.dontwait.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {

    @Autowired
    private MessageService messageService;

    void processMessage(String message) {
        messageService.sendMessage(message);
    }
}
