package com.spring.study.domain.user;

import java.util.List;

public interface UserRepository {
	public List<User> getUserAll();
	public int idCheck(String username);
	public int insertUser(User user);
	public int signin(User user);
}
