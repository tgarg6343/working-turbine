package com.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class Controller {

	@HystrixCommand(fallbackMethod="fallback",
			commandKey="byeMethod", groupKey="byeController")
	@GetMapping("bye")
	public String bye() {
		throw new RuntimeException();
	}
	
	public String fallback() {
		return "We in fallback now";
	}
	
}
