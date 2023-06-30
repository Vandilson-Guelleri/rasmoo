package com.client.api.integration;

import com.client.api.dto.wsraspay.CustomerDto;
import com.client.api.dto.wsraspay.OrderDto;
import com.client.api.dto.wsraspay.PaymentDto;

public interface WsRaspayIntegration {

	CustomerDto createCustomer(CustomerDto dto);
	
	OrderDto createOrder(OrderDto dto);
	
	Boolean processPayment(PaymentDto dto);
}
