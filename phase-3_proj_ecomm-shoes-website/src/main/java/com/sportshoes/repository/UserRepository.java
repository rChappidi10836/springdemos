package com.sportshoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportshoes.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

	int findById = 0;

	Users findBynameAndPwd(String username, String password);

	Users findByuid(int uid);

}
