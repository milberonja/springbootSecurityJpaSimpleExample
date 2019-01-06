package com.milan.springbootsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	
	@RequestMapping("/")
	public String process() {
		
		return "<h1>This simple Spring boot Security App show you how security works </h1>"
				+ "<h2>To test this app just click on this links bellow</h2>"
				+ "<a href='/unsecure/auth/process'>Link for unsecured page</a> - This page is not secured<br><br>"
				+ "<a href='/secure/auth/admin/add'>Link for secured page</a> - This page is secured - Only Admin user can success to it<br><br>"
				+ "<a href='/secure/auth/admin/all'>Link for secured page</a> - This page is secured - Only Admin user can success to it<br><br>";
				
	}

}
