package com.aegon.pension.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "customer")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;	
	
	public int getId() { return id; }
  
	public void setId(int i) { this.id = i; }
  
	public String getFirstName() { return firstName; }
  
	public void setFirstName(String firstName) { this.firstName = firstName; }
  
	public String getLastName() { return lastName; }
  
	public void setLastName(String lastName) { this.lastName = lastName; }
  
	public String getDob() { return dob; }
  
	public void setDob(String dob) { this.dob = dob; }
  
	public String getEmailId() { return emailId; }
  
	public void setEmailId(String emailId) { this.emailId = emailId; }
  
  	public String getValuation() { return valuation; }
  
  	public void setValuation(String valuation) { this.valuation = valuation; }
  	
  	public String getProductId() { return productId; }
    
  	public void setProductId(String productId) { this.productId = productId; }
  	
  	public String getProductName() { return productName; }
    
  	public void setProductName(String productName) { this.productName = productName; }
  
	@Column(name = "FIRST_NAME")
	private String firstName = "";
	
    @Column(name = "LAST_NAME")
    private String lastName;
	
    @Column(name = "DOB")
	private String dob = "";
	
    @Column(name = "EMAIL_ID")
	private String emailId = "";
	
    @Column(name = "VALUATION")
	private String valuation = "";
    
    @Column(name = "PRODUCT_ID")
    private String productId = "";
    
    @Column(name = "PRODUCT_NAME")
    private String productName = "";
    
    /*public List<Product> getProduct() { return product; }

	public void setProduct(List<Product> product) { this.product = product; }*/

    
    //@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    //@JoinColumn
    //@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class)
    //@ElementCollection
    //private List<Product> product;
   
	

}
