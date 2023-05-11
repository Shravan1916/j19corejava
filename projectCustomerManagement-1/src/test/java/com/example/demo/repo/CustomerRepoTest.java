package com.example.demo.repo;

import com.model.*;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.CustomerRepository;

@SpringBootTest
public class CustomerRepoTest {
	@Autowired
	CustomerRepository customerRepo;
	
	@Test
	void isProdeuctExitsById()
	{
		Customer c=new Customer("Digya",9879);
		customerRepo.save(c);
		
		Boolean actualResult=customerRepo.isProdeuctExitsById(13);
		assertThat(actualResult).isTrue();
	}

}
