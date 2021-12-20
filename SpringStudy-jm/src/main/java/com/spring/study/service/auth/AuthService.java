package com.spring.study.service.auth;

import java.util.Map;

import com.spring.study.web.dto.auth.SigninReqDto;
import com.spring.study.web.dto.auth.SigninRespDto;
import com.spring.study.web.dto.auth.SignupReqDto;
import com.spring.study.web.dto.auth.SignupRespDto;

public interface AuthService {
	
	//signup
	public SignupRespDto usernameCheck(SignupReqDto signupReqDto);
	public boolean signup(SignupReqDto signupReqDto);
	
	//signin
	//제네릭으로 맵을 보내겠다.
	public SigninRespDto signin(SigninReqDto signinReqDto);
	
}
