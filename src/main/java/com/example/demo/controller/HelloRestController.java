package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @RestController:descibes the rest controller class.
 * @RequestMapping:describe the URL.
 *
 */
@RestController
@RequestMapping("/hello")
public class HelloRestController {

	@RequestMapping(value = { "", "/", "/home" })
	public String sayHello() {
		return "Hello From BridgeLabz";
	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	@RequestMapping(value = { "/query" }, method = RequestMethod.GET)
	public String sayHello(@RequestParam(value = "name") String name) {
		return "Hello " + name + " From Bridgelabz";
	}

	/**
	 * @GetMapping: mapping HTTP GET requests onto specific handler methods
	 * @param name
	 * @return
	 */
	@GetMapping("/param/{name}")
	public String sayHelloPara(@PathVariable String name) {
		return "Hello " + name + " From Bridgelabz";
	}

}
