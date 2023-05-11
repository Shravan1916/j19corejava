package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CustomerRepository;
import com.exception.NoSuchCustomerException;
import com.model.Customer;



@Service
public class CustomerServiceImpl {
	
	@Autowired
	CustomerRepository customerRepo;
	
	
	public void addCustomer() {
		ArrayList<Customer> cus=new ArrayList<Customer>();
		cus.add(new Customer("Ajay",4900));
		cus.add(new Customer("Vijay",7856));
		cus.add(new Customer("Jay",9765));
		
		
		for(Customer c:cus)
			customerRepo.save(c);
	}
	
	
	public void deleteAllData() {
		customerRepo.deleteAll();
		
	}
	
	public String deleteCustomer(int id) {
		customerRepo.deleteById(id);
		return "customer removed"+id;	}
	
	public Customer addoneCustomer(Customer customer) {
		return customerRepo.save(customer);
		
	}
	
	public List<Customer> savedCustomer(List<Customer>customer)
	{
		return customerRepo.saveAll(customer);
	}
	
	public Customer getCustomerById(int id)
	{
		
		return customerRepo.findById(id).orElseThrow(
		()->
		new NoSuchCustomerException("No such customer with id"+id)
		);
	}

	public Customer updateCustomer(Customer customer) {
		Customer existingCustomer=customerRepo.findById(customer.getId()).orElse(null);
		existingCustomer.setName(customer.getName());
		return customerRepo.save(existingCustomer);	
	}
	
	public List<Customer> getCustomer(){
		return customerRepo.findAll();
		
	}
	
	public Customer getCustomerByName(String name) {
		return customerRepo.findByName(name);
	}
}
