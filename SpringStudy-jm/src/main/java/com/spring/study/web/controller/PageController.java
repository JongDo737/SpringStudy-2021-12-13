package com.spring.study.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.study.web.dto.SignupReqDto;

//@Component
//@Service
//@Repository
//@Configuration
@Controller
public class PageController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String indexForm( ) {
		
		return "index/index";// 경로설정
		
	}
	@RequestMapping(value = "/signin", method = RequestMethod.GET )
	public String signinForm() {
		return "auth/signin";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET )
	public String signupForm(SignupReqDto sdto) {
		sdto.getEmail();
		return "auth/signup";
	}
}
