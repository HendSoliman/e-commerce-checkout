package com.menus.commerce.entity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class OrderFactory {
	private final OrderIdGenerator idGenerator;

	public OrderFactory(OrderIdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	public OrderEntity create(List<OrderItemEntity> items, Address address,UserEntity user) {
		String orderId = idGenerator.generate();
		return OrderEntity.create(orderId, items, address, user);
	}
}
