package com.gabhasti.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.gabhasti.product.beans.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	
}
