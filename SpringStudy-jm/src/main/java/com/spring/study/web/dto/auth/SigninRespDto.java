package com.spring.study.web.dto.auth;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SigninRespDto {
	
	private String username;
	private String password;
	
	private int signinFlag;
	
}
