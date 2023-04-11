package com.sportshoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sportshoes.entity.Bills;

public interface BillsRepository extends JpaRepository<Bills, Integer>{
	
//	@Query("SELECT b.bid,u.name,p.name, p.category,b.date, b.amount FROM users u INNER JOIN bills b ON u.uid = b.uid INNER JOIN products p ON p.pid = b.pid order by b.bid")
//	List<Object[]> findRequiredData();
	
	@Query("SELECT b.bid, u.name AS user_name, p.name AS product_name, p.category, b.date, b.amount as paid_amount " +
	           "FROM Bills b JOIN b.user u JOIN b.product p order by b.bid")
	    List<Object[]> getBillDetails();
	
}
