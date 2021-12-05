package com.menus.commerce.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.menus.commerce.dto.OrderSummry;
import com.menus.commerce.dto.command.OrderCommand;
import com.menus.commerce.entity.OrderEntity;
import com.menus.commerce.entity.OrderItemEntity;
import com.menus.commerce.entity.UserEntity;

public interface OrderService {

	public Iterable<OrderEntity> getOrdersByCustomerId(@NotNull @Valid String customerId);

	public Optional<OrderEntity> getByOrderId(String id);

	public OrderSummry createOrder(List<OrderItemEntity> orderItems, @Valid OrderCommand newOrder, UserEntity user);
}
