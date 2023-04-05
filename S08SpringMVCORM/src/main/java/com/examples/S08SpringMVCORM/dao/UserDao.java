package com.examples.S08SpringMVCORM.dao;

import java.util.List;

import com.examples.S08SpringMVCORM.entity.User;

public interface UserDao {
	
	int create(User user);
	
	List<User> findUsers();
	
	User findUser(String email);
	
}
