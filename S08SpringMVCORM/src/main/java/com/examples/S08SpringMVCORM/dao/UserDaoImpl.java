package com.examples.S08SpringMVCORM.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.examples.S08SpringMVCORM.entity.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	private static final String User = null;
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public int create(User user) {
		int result = (int) hibernateTemplate.save(user);
		return result;
	}

	@Override
	public List<User> findUsers() {
		return hibernateTemplate.loadAll(User.class);
	}

	@Override
	public User findUser(String email) {
		User result=null;
		List<?> users =  hibernateTemplate.find("from User u where u.email =?0", email);
		if(users!=null && users.size() >0)
			result =(User) users.get(0);
		return result;
	}

}
