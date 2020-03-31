package com.gabhasti.product.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	}

	@GetMapping("/opportunity")
	public ResponseEntity<List<CEP_OPPORTUNITY_MASTER>> findAll(){
		List<CEP_OPPORTUNITY_MASTER> respList = new ArrayList<>();
		try {
			log.debug("Save start");
			respList=(List<CEP_OPPORTUNITY_MASTER>) repository.findAll();
			log.debug("Save complete");
		} catch (Exception e) {
			log.fatal("Exception ::", e);
			return new ResponseEntity<>(respList,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(respList,HttpStatus.OK);
		
		
	}
	
	@GetMapping("/opportunity/{opportunityId}")
	public ResponseEntity<Optional<CEP_OPPORTUNITY_MASTER>> findAll(@PathVariable(name = "opportunityId") long opportunityId){
		Optional<CEP_OPPORTUNITY_MASTER> resp = Optional.of(new CEP_OPPORTUNITY_MASTER()) ;
		try {
			log.debug("Save start");
			resp= repository.findById(opportunityId);
			log.debug("Save complete");
		} catch (Exception e) {
			log.fatal("Exception ::", e);
			return new ResponseEntity<>(resp,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(resp,HttpStatus.OK);
		
		
	}
	
	
	@PostMapping("/opportunity")
	public ResponseEntity processOpportunityBulkUpload(@RequestBody List<CEP_OPPORTUNITY_MASTER> newOpportunityList) {
		try {
			log.debug("Save start");
			newOpportunityList.stream().forEach(
					opp -> opp.getCepOpportunityDir().stream()
						.forEach(dir -> dir.setCepOpportunityMaster(opp))
					
					);
			
			
			//newOpportunity.getCepOpportunityDir().stream()
			//		.forEach(dir -> dir.setCepOpportunityMaster(newOpportunity));
			repository.saveAll(newOpportunityList);
			log.debug("Save complete");
		} catch (Exception e) {
			log.fatal("Exception ::", e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
		

	}

}
