package com.in28minutes.springboot;

import org.springframework.stereotype.Component;

@Component//Or @Service is also managed by spring and creates an instance of it
//If one of these annotations is not given OR if this is in another package than it's controller (where it's being auto-wired up)- below exception is thrown
/*
 * org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'welcomeController': 
 * Unsatisfied dependency expressed through field 'service': 
 * No qualifying bean of type [com.in28minutes.springboot.WelcomeService] found for dependency [com.in28minutes.springboot.WelcomeService]: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.in28minutes.springboot.WelcomeService] found for dependency [com.in28minutes.springboot.WelcomeService]: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
 */
public class WelcomeService {
	public String getWelcomeMsg(){
		//In reality some complex logic
		return "Hello Spring Boot With Spring Dependency!";
	}
}