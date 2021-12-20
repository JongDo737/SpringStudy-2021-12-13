package com.spring.study.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String indexForm() {
		return "index/index";
	}
	
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String signinForm() {
		return "auth/signin";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signupForm() {
		return "auth/signup";
	}
}
