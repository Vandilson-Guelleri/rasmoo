package com.client.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.api.model.SubscriptionType;
import com.client.api.model.User;
import com.client.api.repository.SubscriptionTypeRepository;

@RestController
@RequestMapping("/subscription-type")
public class SubscriptionTypeController {

	@Autowired
	private SubscriptionTypeRepository subscriptionTypeRepository;
	
	@GetMapping
	public ResponseEntity<List<SubscriptionType>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeRepository.findAll());
	}
}