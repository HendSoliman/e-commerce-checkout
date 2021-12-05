package com.menus.commerce.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.menus.commerce.dto.OrderSummry;
import com.menus.commerce.dto.command.OrderCommand;
import com.menus.commerce.entity.OrderItemEntity;
import com.menus.commerce.entity.UserEntity;

@Service
public class CheckoutService {

	@Autowired
	CartService cartService;
	
	@Autowired
	UserService userService;
	@Autowired
	OrderService orderService;

	public OrderSummry checkoutAndPlaceOrder(@Valid OrderCommand newOrder) {

		/**
		 * TODO Authentication 
		 */
		
		UserEntity loggedInUser= userService.findById(newOrder.getCustomerId());
		
		
		// [1] call cart service to get items from cart
		List<OrderItemEntity> orderItems = cartService.listCartItemsOfSpecificUser(newOrder.getCustomerId());

		// [3] get Billing Information from user

         
		// [4] call order service to processed
		OrderSummry orderSummry = orderService.createOrder(orderItems, newOrder,loggedInUser);
		 
		 
		

		return orderSummry;
	}

}
