package com.aegon.pension.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aegon.pension.model.Customer;

	@Repository
	public interface CustomerRepository extends JpaRepository<Customer, String>{	
		Customer findByEmailId(String emailId);	
	}
