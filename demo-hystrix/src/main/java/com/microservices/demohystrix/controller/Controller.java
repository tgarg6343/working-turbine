package com.microservices.demohystrix.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class Controller {

	@HystrixCommand(fallbackMethod="fallback", 
			commandKey="helloMethod", groupKey="Controller")
	@GetMapping("hi")
	public String hi() {
		return "hi";
	}
	
	public String fallback() {
		return "fallback";
	}
}
