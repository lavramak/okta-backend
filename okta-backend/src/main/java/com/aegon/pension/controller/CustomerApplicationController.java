package com.aegon.pension.controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aegon.pension.model.Customer;
import com.aegon.pension.service.CustomerService;

@RestController
@RequestMapping("/")
@EnableJpaRepositories(basePackages="com.aegon.pension.repository")
@EnableJpaAuditing
//@CrossOrigin(origins = "http://localhost:4200")//To be commented before aws deployment
public class CustomerApplicationController {
	
	@Autowired
	private CustomerService custService;
		
	@GetMapping("/customer")
	public CompletableFuture<Customer> getCustomerById(@RequestParam(value="emailId") String emailId){	
		CompletableFuture<Customer> cust = null;
		try {
			cust = custService.findByEmailId(emailId);	
		}
		catch(Exception e) {
		 e.printStackTrace();
		}
		return cust;
	}	
	
	@GetMapping("/customers")
	public List<Customer> getCustomers() throws InterruptedException{		
		return custService.findAll();

	}
}
