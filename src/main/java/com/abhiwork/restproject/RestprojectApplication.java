package com.abhiwork.restproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages  = "com.abhiwork")
public class RestprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestprojectApplication.class, args);
	}

}
