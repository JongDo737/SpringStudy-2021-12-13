package com.spring.study.web.dto.auth;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SignupRespDto {
	private String username;
	private String password;
	private String name;
	private String email;
	
	private boolean idCheckFlag;
}
