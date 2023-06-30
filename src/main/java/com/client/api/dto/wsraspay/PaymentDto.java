package com.client.api.dto.wsraspay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {

	private CreditCardDto creditCardDto;
	private String customerId;
	private String orderId;
}
