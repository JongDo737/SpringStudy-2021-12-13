package com.spring.study.domain.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAME_SPACE ="com.spring.study.domain.user.UserRepository.";
	
	@Override
	public List<User> getUserAll() {
		return sqlSession.selectList(NAME_SPACE + "getUserAll");
	}

	@Override
	public int idCheck(String username) {
		return sqlSession.selectOne(NAME_SPACE + "idCheck", username);
		//레파지토리에서 db -- username --> 값을 메퍼로 보내서 
	}

	@Override
	public int insertUser(User user) {
		return sqlSession.insert(NAME_SPACE + "insertUser", user);
	}
	@Override
	public int signin(User user) {
		return sqlSession.selectOne(NAME_SPACE + "signin", user);
	}
}
