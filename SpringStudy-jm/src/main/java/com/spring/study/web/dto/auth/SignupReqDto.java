package com.spring.study.web.dto.auth;

import com.spring.study.domain.user.User;

import lombok.Data;

@Data
public class SignupReqDto {
	private String username;
	private String password;
	private String name;
	private String email;
	
	private int submitFlag;
	
	public SignupRespDto toResponseDto(boolean idCheckFlag) {
		return SignupRespDto.builder()	//signupRespDto에 @builder 를 달아놔서 빌더메서드를 사용할 수 있는것
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.idCheckFlag(idCheckFlag)
				.build();
				
	}
	
	public User toEntity() {
		return User.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.build();
	}
}






