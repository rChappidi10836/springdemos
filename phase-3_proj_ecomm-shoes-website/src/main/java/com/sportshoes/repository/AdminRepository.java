package com.sportshoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportshoes.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
	
	Admin findByUsernameAndPassword(String username, String password);
	 
}
