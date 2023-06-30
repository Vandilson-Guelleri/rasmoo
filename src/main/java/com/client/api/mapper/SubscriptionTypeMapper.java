package com.client.api.mapper;

import com.client.api.dto.SubscriptionTypeDto;
import com.client.api.model.SubscriptionType;

public class SubscriptionTypeMapper {

	public static SubscriptionType fromDtoToEntity(SubscriptionTypeDto dto) {
		return SubscriptionType.builder()
				.id(dto.getId())
				.name(dto.getName())
				.acessMonths(dto.getAcessMonths())
				.price(dto.getPrice())
				.productKey(dto.getProductKey())
				.build();
	}
}
