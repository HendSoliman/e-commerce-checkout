package com.menus.commerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.menus.commerce.entity.UserEntity;
import com.menus.commerce.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserEntity findById(Long id) {
		return userRepository.getById(id);
	}

}
