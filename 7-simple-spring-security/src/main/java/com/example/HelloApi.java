package com.example;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {
	@GetMapping("/home")
public String hello() {
		//String pwd="Hello";
		//PasswordEncoder encoder=new BCryptPasswordEncoder();
		//String encodedPwd=encoder.encode(pwd);
		//System.out.println("Password : "+encodedPwd);
	return "Hello Home page";
}
	@GetMapping("/home/add")
	public String adminPage() {
		return "ITs Admin";
	}
}