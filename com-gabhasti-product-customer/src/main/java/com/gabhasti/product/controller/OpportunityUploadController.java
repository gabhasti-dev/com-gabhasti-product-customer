package com.gabhasti.product.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gabhasti.product.beans.CEP_OPPORTUNITY_MASTER;
import com.gabhasti.product.repository.OpportunityRepository;

@RestController
public class OpportunityUploadController {
	private static final Logger log = LogManager.getLogger(OpportunityUploadController.class.getName());

	@Autowired
	private OpportunityRepository repository;
	public OpportunityUploadController() {
		// TODO Auto-generated constructor stub
	}

	@PostMapping("/opportunity")
	public ResponseEntity processOpportunityBulkUpload(@RequestBody CEP_OPPORTUNITY_MASTER newOpportunity) {
		try {
			log.debug("Save start");
			repository.save(newOpportunity);
			log.debug("Save complete");
		} catch (Exception e) {
			log.fatal("Exception ::",e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
		//return "success";

		
		
	}



}
