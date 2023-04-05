package com.examples.S08SpringMVCORM.service;

import java.util.List;

import com.examples.S08SpringMVCORM.entity.User;
import com.examples.S08SpringMVCORM.exception.UserAlreadyExistsException;

public interface UserService {
	
	int save(User user) throws UserAlreadyExistsException;
	
	List<User> getUsers();
}
