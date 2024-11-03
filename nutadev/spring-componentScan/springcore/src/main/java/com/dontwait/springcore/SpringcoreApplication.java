package com.dontwait.springcore;

import com.dontwait.springcore.others.Girl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

//@SpringBootApplication(scanBasePackages = "com.dontwait.springcore.others")
//@ComponentScan("com.dontwait.springcore.others")
@SpringBootApplication
public class SpringcoreApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringcoreApplication.class, args);

		System.out.println("Sau khi run app");

		Girl girl = context.getBean(Girl.class);
		System.out.println(girl);
	}

}
