package com.in28minutes.springboot.in28minutesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   // initialize the spring (component scan) and  spring boot(Auto configuration)
public class In28minutesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(In28minutesDemoApplication.class, args);
	}

}

