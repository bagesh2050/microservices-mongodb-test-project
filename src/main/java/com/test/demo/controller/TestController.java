package com.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/api")
	public String getUserName() {
		return "{\"name\":\"SBS Team V9\"}";
	}
}
