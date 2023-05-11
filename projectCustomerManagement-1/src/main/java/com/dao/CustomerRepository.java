package com.dao;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	
	Customer findByName(String name);

	
	
	@org.springframework.data.jpa.repository.Query("select case when count(c)>0 then true else false end from Customer c where id=?")
	Boolean isProdeuctExitsById(int i);
	
	

}
