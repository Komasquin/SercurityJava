package com.example.springsecurityjpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome!</h1>");
	}//end of method 'home()'
	
	@GetMapping("/user")
	public String user() {
		return ("<h1>Welcome User!</h1>");
	}//end of method 'user()'
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Welcome Admin!</h1>");
	}//end of method 'admin()'
	
}
