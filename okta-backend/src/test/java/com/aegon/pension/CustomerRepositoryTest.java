package com.aegon.pension;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import com.aegon.pension.model.Customer;
import com.aegon.pension.repository.CustomerRepository;

@ExtendWith(MockitoExtension.class)
public class CustomerRepositoryTest {
	
	
		@Before
	    public void init() {
	        MockitoAnnotations.initMocks(this);
	    }
	  @Mock
	  private CustomerRepository custRepository;
	  
	  @Mock
	  private Customer cust;
	  
	  @Test
	  public void should_return_value_when_find_by_emailId() {	  
		  cust.setId(1);
		  cust.setValuation("4000");
		  cust.setDob("10011985");
		  cust.setFirstName("Lavanya");
		  cust.setLastName("Ramakrishnan");
		  when(custRepository.findByEmailId("lavankrishnan@gmail.com")).thenReturn(cust);
		  
	  }

}
