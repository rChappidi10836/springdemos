package com.examples.S08SpringMVCORM.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.S08SpringMVCORM.dao.UserDao;
import com.examples.S08SpringMVCORM.entity.User;
import com.examples.S08SpringMVCORM.exception.UserAlreadyExistsException;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userdao;
	
	@Override
	@Transactional
	public int save(User user) throws UserAlreadyExistsException {
		//usually business logic is applied here
		/*
		 if(user.getEmail() already exits )
		{
			throw an exception
		}
		*/
		if(userdao.findUser(user.getEmail())!=null) {
			throw new UserAlreadyExistsException(user.getEmail());
		}
		return userdao.create(user);
	}

	@Override
	public List<User> getUsers() {
		return userdao.findUsers();
	}
	
	
	
}
