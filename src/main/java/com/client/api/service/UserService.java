package com.client.api.service;

import com.client.api.dto.UserDto;
import com.client.api.model.User;

public interface UserService {

	User create(UserDto dto);
}
