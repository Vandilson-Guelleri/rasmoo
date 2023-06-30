package com.client.api.service;

import java.util.List;

import com.client.api.dto.SubscriptionTypeDto;
import com.client.api.model.SubscriptionType;

public interface SubscriptionTypeService {

	List<SubscriptionType> findAll();
	
	SubscriptionType findById(Long id);
	
	SubscriptionType create(SubscriptionTypeDto dto);
	
	SubscriptionType update(Long id, SubscriptionTypeDto dto);
	
	void delete(Long id);
}
