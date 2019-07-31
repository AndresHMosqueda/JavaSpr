package com.exampleAndres1.app.ws.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleAndres1.app.ws.UserRepository;
import com.exampleAndres1.app.ws.io.entity1.UserEntity1;
import com.exampleAndres1.app.ws.service.UserInterface;
import com.exampleAndres1.app.ws.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserInterface {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDto createUser(UserDto user) {
		
		
		UserEntity1 userEntity = new UserEntity1();
		BeanUtils.copyProperties(user, userEntity);
		 
		userEntity.setEncryptedPassword("test");
		userEntity.setUserId("testUserId");
		
		UserEntity1 storedUserDetails = userRepository.save(userEntity);
		
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);
		
		return returnValue;
	}

}
