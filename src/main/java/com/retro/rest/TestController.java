package com.retro.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /* ("/rest") */
public class TestController {

	

	@RequestMapping("/hello")
	    public String helloGradle() {
	        return "Hello there!";
}
}
