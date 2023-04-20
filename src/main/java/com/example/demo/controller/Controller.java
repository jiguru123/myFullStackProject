package com.example.demo.controller;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TempLogDetails;
import com.example.demo.repository.Repository;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	private Repository repository;

	@GetMapping("/getTmpHighDuration")
	public Document getTmpHighDuration() {
		AggregationResults<TempLogDetails> aobj =  repository.getHighTimeDuration();
		aobj.getRawResults();
		return aobj.getRawResults();
	}

	
}
