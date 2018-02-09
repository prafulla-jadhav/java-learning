package com.in28minutes.springboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.in28minutes.service.WelcomeService;

//@SpringBootApplication //Optional - If you want to start this application directly as Java application
@RestController
public class WelcomeController {
	
	@Autowired//Auto wiring done by Spring 
	private WelcomeService service; // in normal scenario we do -> = new WelcomeService();
	
	private List<String> dataList = new ArrayList<String>(Arrays.asList("Spring", "REST", "Spirng Rest Controller"));
	
	//If the url entered in wrong, auto configured error page something like below will come up 
	//E.g. http://localhost:8080/
	/*
	 * Whitelabel Error Page

	This application has no explicit mapping for /error, so you are seeing this as a fallback.

	Fri Feb 09 18:37:52 IST 2018
	There was an unexpected error (type=Not Found, status=404).
	No message available
	
	i.e. BasicErrorController.error is called 
	 */
	
	//http://localhost:8080/welcome
	@RequestMapping("/welcome")
	public String welcome() {
		return service.getWelcomeMsg();
	}
	
	//The @RestController is controller is different from the traditional @Controller in a sense that 
	//it returns a Data object instead of View object. It is automatically converted to json using spring
	//Run using - http://localhost:8080/getData?id=2 (or 1 or 0)
	@RequestMapping("/getData")
	public Data getData(@RequestParam(value="id", defaultValue="0") Integer id) {
		return new Data(id, dataList.get(id));
	}
	
	
	//Optional - If you want to start this application directly as Java application
	/*public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(WelcomeController.class, args);

	}*/
}

//We can keep this service bean dependency here also or in a separate package
//@Component //OR @Service  
/*class WelcomeService {
	public String getWelcomeMsg(){
		//In reality some complex logic
		return "Hello Spring Boot With Spring Dependency New!";
	}
}*/