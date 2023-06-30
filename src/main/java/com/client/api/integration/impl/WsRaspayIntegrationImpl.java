package com.client.api.integration.impl;

import java.util.Base64;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.client.api.dto.wsraspay.CustomerDto;
import com.client.api.dto.wsraspay.OrderDto;
import com.client.api.dto.wsraspay.PaymentDto;
import com.client.api.integration.WsRaspayIntegration;

@Component
public class WsRaspayIntegrationImpl implements WsRaspayIntegration{

	private RestTemplate restTemplate;
	
	public WsRaspayIntegrationImpl() {
		restTemplate = new RestTemplate();
	}
	
	@Override
	public CustomerDto createCustomer(CustomerDto dto) {
		try {
		org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
		String credential = "rasmooplus:r@sm00";
		String base64 = new String (org.apache.tomcat.util.codec.binary.Base64.encodeBase64String(credential.getBytes()));
		headers.add("Authorization", "Basic "+base64);
		
		HttpEntity<CustomerDto> request = new HttpEntity<>(dto, headers);
		ResponseEntity<CustomerDto> response = 
				restTemplate.exchange("http://localhost:8081/ws-raspay/v1/customer", HttpMethod.POST,
						request, CustomerDto.class);
		return response.getBody();
		}catch (Exception e) {
			throw e;
		}
	}

	@Override
	public OrderDto createOrder(OrderDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean processPayment(PaymentDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
