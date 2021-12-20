package com.spring.study.service.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.study.domain.user.User;
import com.spring.study.domain.user.UserRepository;
import com.spring.study.web.dto.auth.SigninReqDto;
import com.spring.study.web.dto.auth.SigninRespDto;
import com.spring.study.web.dto.auth.SignupReqDto;
import com.spring.study.web.dto.auth.SignupRespDto;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public SignupRespDto usernameCheck(SignupReqDto signupReqDto) {
		int idCheckCount = userRepository.idCheck(signupReqDto.getUsername());
		if (idCheckCount == 0) {
			// 회원가입 가능한 아이디
			return signupReqDto.toResponseDto(true);
		} else {
			// 이미 존재하는 아이디
			return signupReqDto.toResponseDto(false);
		}
	}

	@Override
	public boolean signup(SignupReqDto signupReqDto) {
		User userEntity = signupReqDto.toEntity();
		// dto를 entity 형태로 만들어줘야함.
		int insertCount = userRepository.insertUser(userEntity);
		// 0 또는 1이 가져와짐 insertUser 반환형 : int
		if (0 < insertCount) {
			System.out.println("insert 성공");
			return true;
		} else {
			System.out.println("insert 실패");
			return false;
		}
	}
	@Override
	public SigninRespDto signin(SigninReqDto signinReqDto) {
		// entity 형태로 변환(빌더 활용)
		User userEntity = signinReqDto.toEntity();
		// 얘를 가지고 조회
		int signinFlag = userRepository.signin(userEntity);
		SigninRespDto signinRespDto = signinReqDto.toResponseDto(signinFlag);
		
		
		return signinRespDto;
	}

}
