package com.client.api.mapper;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;

import com.client.api.dto.UserDto;
import com.client.api.model.SubscriptionType;
import com.client.api.model.User;
import com.client.api.model.UserType;

import lombok.Builder;

public class UserMapper {

	public static User fromDtoToEntity(UserDto dto, UserType userType, SubscriptionType subscriptionType) {
		return User.builder()
				.id(dto.getId())
				.name(dto.getName())
				.cpf(dto.getCpf())
				.email(dto.getEmail())
				.phone(dto.getPhone())
				.dtSubscription(dto.getDtSubscription())
				.dtExpiration(dto.getDtExpiration())
				.userType(userType)
			    .subscriptionType(subscriptionType)
				.build();
	}
}
