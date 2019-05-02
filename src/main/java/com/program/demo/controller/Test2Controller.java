package com.program.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Test2Controller {
	@RequestMapping("/test")
	public  String Index(String username,String pwd)
	{
		return "Login  Error";
	}
	

}
