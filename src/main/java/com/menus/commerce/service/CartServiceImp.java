package com.menus.commerce.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.menus.commerce.entity.CartEntity;
import com.menus.commerce.entity.OrderItemEntity;
import com.menus.commerce.entity.UserEntity;
import com.menus.commerce.exception.NotFoundException;
import com.menus.commerce.repository.CartRepository;

@Service
@Transactional
public class CartServiceImp implements CartService {

	@Autowired
	private CartRepository cartRepository;

	@Override
	public List<OrderItemEntity> listCartItemsOfSpecificUser(Long userId) {

		Optional<CartEntity> existingCart = cartRepository.findByUserId(userId);

		if (!existingCart.isPresent())
			throw new NotFoundException(null); // TODO To read it from message in i118

		List<OrderItemEntity> orderItems = existingCart.get().getItems();
		
		
		return orderItems;
	}

	@Override
	public void deleteUserCartItems(Long userId) {

		cartRepository.deleteByUserId(userId);

	}

	@Override
	public void addMockItemToCart(List<OrderItemEntity> items, UserEntity user) {
		
		CartEntity cart = CartEntity.builder().items(items).user(user).build();
		cartRepository.save(cart);
	}

}
