package com.gabhasti.product.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gabhasti.product.beans.Customer;
import com.gabhasti.product.repository.CustomerRepository;

@RestController
public class CustomerOnBoardingController {

	private static final Logger log = LogManager.getLogger(CustomerOnBoardingController.class.getName());
	@Autowired
	private final CustomerRepository repository;

	public CustomerOnBoardingController(CustomerRepository repository) {
		this.repository = repository;

	}

	@GetMapping("/customer")
	public List<Customer> getCustomers(){
		log.debug("get all customers");
		return (List<Customer>) repository.findAll();
		
	}
	
	
	@PostMapping("/customer")
	public String processCustomerOnBoarding(@RequestBody Customer newCustomers) {
		try {
			log.debug("Save start");
			repository.save(newCustomers);
			log.debug("Save complete");
		} catch (Exception e) {
			log.fatal("Exception ::",e);
			return "failure";
		}
		return "success";

	}
	
	
	
}
