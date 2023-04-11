package com.sportshoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportshoes.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

	Users findBynameAndPwd(String username, String password);

	Users findByuid(int uid);

}
