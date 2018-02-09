package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	//LoginService service = new LoginService();//We are not using Autowiring here
	@Autowired//creates the instance of LoginService and set it in here
	//That means dependency is injected externally by IoC container
	LoginService service;
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	//@ResponseBody -> Used to send the response "Hello World dummy !" and print on screen
	//Else the controller will treat "Hello World dummy !" as a url to redirect or a view name and in this case tomcat server says - 
	//pageNotFound - org.springframework.web.servlet.PageNotFound noHandlerFound
	//In console- WARNING: No mapping found for HTTP request with URI [/spring-mvc/Hello World dummy !] in DispatcherServlet with name 'dispatcher'
	//public String sayHello() {
	public String showLoginPage() {
		//return "Hello World dummy !";
		return "login";//a view name - to refer and render this login.jsp 
	}
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	//@ResponseBody -> Used to send the response "Hello World dummy !" and print on screen
	//Else the controller will treat "Hello World dummy !" as a url to redirect or a view name and in this case tomcat server says - 
	//pageNotFound - org.springframework.web.servlet.PageNotFound noHandlerFound
	//In console- WARNING: No mapping found for HTTP request with URI [/spring-mvc/Hello World dummy !] in DispatcherServlet with name 'dispatcher'
	//public String sHello() {
	public String handleLogin(@RequestParam String name, 
			@RequestParam String password,
			ModelMap model) {//specified same "name" in form - no need to explicitly map 
		//@RequestParam - In normal servlet we used to do it in other way - check LoginServlet.java - first req.getParameter and then req.setAttribute
		//Model -> to pass info/ data between controller and view - We can use ModelMap for it
		System.out.println("Name >>> " + name );
		System.out.println("Password >>> " + password );
		if(!service.validateUser(name, password)){
			model.put("errorMessage", "Invalid Credentials!!");
			return "login";
		}
		model.put("name", name);
		model.put("password", password);
		//return "Hello World dummy !";
		return "welcome";//a view name - to refer and render this login.jsp 
	}
}
