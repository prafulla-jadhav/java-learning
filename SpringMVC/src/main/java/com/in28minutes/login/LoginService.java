package com.in28minutes.login;

import org.springframework.stereotype.Service;

@Service//Spring will create an instance of this bean of it and have it ready wherever it matches/ needed 
//<context:component-scan base-package="com.in28minutes" /> -> makes spring framework search for dependencies/ beans here due to component-scan
//Component-scan - used for searching beans - controllers, services, components
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("in28Minutes") && password.equals("dummy");
	}
}