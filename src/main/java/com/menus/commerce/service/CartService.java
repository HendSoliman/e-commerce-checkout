package com.menus.commerce.service;

import java.util.List;

import com.menus.commerce.entity.OrderItemEntity;
import com.menus.commerce.entity.UserEntity;

public interface CartService {

	List<OrderItemEntity> listCartItemsOfSpecificUser(Long userId);

	public void deleteUserCartItems(Long userId);

	void addMockItemToCart(List<OrderItemEntity> items, UserEntity user);

}
