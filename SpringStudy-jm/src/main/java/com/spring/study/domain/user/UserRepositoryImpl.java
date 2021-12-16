package com.spring.study.domain.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryImpl implements UserRepository{
	
	@Autowired	//sqlsessiontemplte을 임플리먼트하고있어서 오토와이어드가 되는거임
	private SqlSession sqlSession;
	
	@Override
	public List<User> getUsers() {
		
		return null;
	}
}
