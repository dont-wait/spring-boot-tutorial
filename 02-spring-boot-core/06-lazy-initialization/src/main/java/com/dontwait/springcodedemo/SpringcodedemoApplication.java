package com.dontwait.springcodedemo;

import com.dontwait.springcodedemo.rest.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.naming.ldap.Control;


@SpringBootApplication
public class SpringcodedemoApplication {
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringcodedemoApplication.class, args);
		Controller control = context.getBean(Controller.class);
		System.out.println(control);
	}
}
