package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Customer;

public interface CustomerService {
	
	ArrayList<Customer> findAllCustomer();
	
	Customer findAllCustomerByID(int id);
	void addCustomer();
	void deleteAllData();

	
	String deleteCustomer(int id);
	
	Customer updateCustomer(Customer customer);
	
	Customer addoneCustomer(Customer customer);
	
	List<Customer> savedCustomer(List<Customer> customer);
	
	Customer getCustomerById(int id);
	
	List<Customer> getCustomer();
	
	Customer getCustomerByName(String name);
	
	

}
