package com.gabhasti.product.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages = { "com.gabhasti.product.controller", "com.gabhasti.product.service" })
@EnableJpaRepositories(basePackages = { "com.gabhasti.product.repository" })
@EnableTransactionManagement
@EntityScan(basePackages = {"com.gabhasti.product.beans"})
public class Application {

	private static final Logger logger = LogManager.getLogger(Application.class.getName());
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);

	}
}
