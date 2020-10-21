package com.todo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.todo.model.HelloWorldBean;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping("/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {

		//throw new RuntimeException("Something went wrong");
		return new HelloWorldBean("Hello World " + name);
	}
	
	
}
