package com.client.api.Integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.client.api.dto.wsraspay.CustomerDto;
import com.client.api.integration.WsRaspayIntegration;

@SpringBootTest
class WsRaspayIntegrationImplTest {

	@Autowired
	private WsRaspayIntegration wsRaspayIntegration;
	
	@Test
	void createCustomerWhenDtoOK() {
		
		CustomerDto dto = new CustomerDto(null,"06905386936","vandilsonguelleri@gmail.com","Vandilson","Guelleri");
		wsRaspayIntegration.createCustomer(dto);
	}
}
