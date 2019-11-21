package com.aegon.pension.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.aegon.pension.model.Customer;
import com.aegon.pension.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository custRepository;
	
	@Async
	public CompletableFuture<Customer> findByEmailId(String emailId) {
		
		if(emailId == null) {
			return null;
		}
		Customer cust = custRepository.findByEmailId(emailId);
		return CompletableFuture.completedFuture(cust);	
		
	}

	public List<Customer> findAll() {
		List<Customer> cust = custRepository.findAll();
		return cust;
	}
}
