package com.dontwait.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringcoreApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringcoreApplication.class, args);
		Client client = context.getBean(Client.class);
		client.processMessage("Abc");

//		EmailService emailService = context.getBean(EmailService.class);
//		emailService.sendMessage("Ahihi");
	}
//	public static void main(String[] args) {
//		SpringApplication.run(SpringcoreApplication.class, args);
//
//		//each run, init is obligatory
//		//how we can pass it for Spring container????
		// Spring container will help us to init in Application
//		EmailService emailService = new EmailService();
//		emailService.sendMessage("abc");
//	}

}
