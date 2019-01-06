package com.milan.springbootsecurity.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.milan.springbootsecurity.model.User;
import com.milan.springbootsecurity.repository.UserRepository;

@RestController
@RequestMapping("/secure/auth")
public class AdminController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	/*@PreAuthorize("hasAnyRole('ADMIN')")*/
	@PostMapping("/admin/add")
	public String addUserByAdmin(@RequestBody User user) {
		System.out.println(user);
		String pwd = user.getPassword();
		String encryptPwd = passwordEncoder.encode(pwd);
		user.setPassword(encryptPwd);
		userRepository.save(user);
		return "user added successfully...";
	}

	//@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/admin/all")
	public String securedHello() {
		return "Secured Hello";
	}
}