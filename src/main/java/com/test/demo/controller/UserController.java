package com.test.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.model.User;
import com.test.demo.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository repo;

	@GetMapping("/user/{id}")
	public User getUserInformation(@PathVariable("id") String login) {
		return repo.findByLogin(login);
	}

	@PostMapping("/user")
	public User createUser(@RequestBody @Valid User user) {
		return repo.save(user);
	}
}
