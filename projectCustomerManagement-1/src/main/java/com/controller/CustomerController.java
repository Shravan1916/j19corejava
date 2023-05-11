package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.service.CustomerServiceImpl;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerServiceImpl cusServiceImpl;

	@PostMapping("/add")
	public String saveCustomer() 
	{
		 cusServiceImpl.addCustomer();
	return"done";
	}
	
	@DeleteMapping("/delete")
	public String  delete() {
		cusServiceImpl.deleteAllData();
		return "deleted";
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String delCustomer(@PathVariable int id) {
		cusServiceImpl.deleteCustomer(id);
		return "id deleted";
		
	}
	
	@PostMapping("/addCustomer")
	public Customer saveCustomer(@RequestBody Customer customer) 
	{
		 return cusServiceImpl.addoneCustomer(customer);
	     
	}
	
	@PostMapping("/addCustomers")
	public List<Customer> savedCustomer(@RequestBody List<Customer> customer)
	{
		return cusServiceImpl.savedCustomer(customer);
	}

	@GetMapping("/customer/{id}")
	public Customer findCustomerById(@PathVariable int id) {
		return cusServiceImpl.getCustomerById(id);
	}
	
	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return cusServiceImpl.updateCustomer(customer);
	}
	
	@GetMapping("/customers")
	public List<Customer> findAllCustomer(){
		return cusServiceImpl.getCustomer();
	}
	
	@GetMapping("/{name}")
	public Customer findCustomerByName(@PathVariable String name) {
		return cusServiceImpl.getCustomerByName(name);
	}
}
