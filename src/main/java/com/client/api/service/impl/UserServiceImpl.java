package com.client.api.service.impl;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.api.dto.UserDto;
import com.client.api.exception.BadRequestException;
import com.client.api.exception.NotFoundException;
import com.client.api.mapper.UserMapper;
import com.client.api.model.User;
import com.client.api.model.UserType;
import com.client.api.repository.UserRepository;
import com.client.api.repository.UserTypeRepository;
import com.client.api.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserTypeRepository userTypeRepository;
	
	@Override
	public User create(UserDto dto) {
		
		if(Objects.nonNull(dto.getId())) {
			throw new BadRequestException("id deve ser nulo");
		}
		
		var userTypeOpt = userTypeRepository.findById(dto.getUserTypeId());
		
		if(userTypeOpt.isEmpty()) {
			throw new NotFoundException("userTypeId não encontrado");
		}
		
		UserType userType = userTypeOpt.get();
		User user = UserMapper.fromDtoToEntity(dto, userType, null);
		return userRepository.save(user);
	}

}
