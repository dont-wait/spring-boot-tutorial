package com.dontwait.springcodedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(
//		scanBasePackages = {
//				"com.dontwait.util",
//				"com.dontwait.springcodedemo"
//		})
//Khai bao cho spring biet phai quét hết các thu mục ngoài phạm vi quản lí của nó
@SpringBootApplication
public class SpringcodedemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringcodedemoApplication.class, args);
	}
}
