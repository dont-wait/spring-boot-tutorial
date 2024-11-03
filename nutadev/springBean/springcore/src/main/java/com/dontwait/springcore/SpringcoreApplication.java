package com.dontwait.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringcoreApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringcoreApplication.class, args);

//		Boy boy = context.getBean(Boy.class);
//		System.out.println("boy = " + boy);
//		boy.useObjectMapper();


		Boy boy1 = context.getBean(Boy.class);
		System.out.println("boy = " + boy1);

		Boy boy2 = context.getBean(Boy.class);
		System.out.println("boy = " + boy2);
	}

}
