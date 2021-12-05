package com.menus.commerce.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.menus.commerce.dto.OrderSummry;
import com.menus.commerce.dto.command.OrderCommand;
import com.menus.commerce.entity.Address;
import com.menus.commerce.entity.OrderEntity;
import com.menus.commerce.entity.OrderFactory;
import com.menus.commerce.entity.OrderItemEntity;
import com.menus.commerce.entity.UserEntity;
import com.menus.commerce.validator.OrderValidator;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderServiceImp implements OrderService {

	private OrderFactory orderFactory;

	@Autowired
	CartService cartService;

	@Autowired
	OrderValidator orderValidator;

	@Override
	public Iterable<OrderEntity> getOrdersByCustomerId(@NotNull @Valid String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<OrderEntity> getByOrderId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderSummry createOrder(List<OrderItemEntity> orderItems, @Valid OrderCommand newOrder, UserEntity user) {

		// [2] get Address Information from user
		Address shipmentAddress = newOrder.getAddress();

		orderValidator.validateOrderPayload(orderItems);
		// AS No Errors were thrown we can place the order

		// 4.3 processPayment (billinginfo , amount) ( throw payment failed)

		// TODO Not included shipment
		// Place order and return order summery
		OrderEntity createdOrder = orderFactory.create(orderItems, shipmentAddress, user);

		return OrderSummry.fromEntityToDTo(createdOrder);
	}

}
