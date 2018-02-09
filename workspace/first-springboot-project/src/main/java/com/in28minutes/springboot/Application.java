package com.in28minutes.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//Spring Boot application launcher class

//@ComponentScan("com.in28minutes") // - needed when the @Component marked dependencies/ beans are outside this package
//Defines where the spring should search/ look for dependencies. Once finds any classes with @Component or @Service - creates an instance 
//and injects where is used with @Autowired annotation
//@EnableAutoConfiguration -> we can use these 2 together (ComponentScan and EnableAutoConfiguration) OR @SpringBootApplication 
//OR
@SpringBootApplication//Has lot of background things happening in background
//@ComponentScan("com.in28minutes") - can be used in conjunction with this
public class Application {

	public static void main(String[] args) {
		//SpringApplication is one of the utility classes in spring boot
		ApplicationContext ctx = SpringApplication.run(Application.class, args);//Pass application class to it and pass args

	}

}