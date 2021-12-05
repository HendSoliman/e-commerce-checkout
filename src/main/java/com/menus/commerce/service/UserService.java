package com.menus.commerce.service;

import com.menus.commerce.entity.UserEntity;

public interface UserService {
	
	UserEntity findById(Long id);
}
