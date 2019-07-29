package com.example.helloboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloBootController {

	@Autowired
	HelloBootConfig appConfig;

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello, " + appConfig.getMessage() + "!";
	}

	@RequestMapping("/secret")
	@ResponseBody
	String secret() {
		return "Secret is: " + appConfig.getTest();
	}
}
