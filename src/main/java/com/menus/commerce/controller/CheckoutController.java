package com.menus.commerce.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.menus.commerce.dto.OrderSummry;
import com.menus.commerce.dto.command.OrderCommand;
import com.menus.commerce.entity.OrderItemEntity;
import com.menus.commerce.entity.ProductEntity;
import com.menus.commerce.entity.UserEntity;
import com.menus.commerce.repository.ItemRepository;
import com.menus.commerce.repository.ProductRepository;
import com.menus.commerce.repository.UserRepository;
import com.menus.commerce.service.CartService;
import com.menus.commerce.service.CheckoutService;

@RestController
@RequestMapping("/order")
public class CheckoutController {

	@Autowired
	private CheckoutService checkoutService;
	@Autowired
	CartService cartService;

	@Autowired
	ItemRepository itemRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	ProductRepository productRepository;

	/**
	 * checkout-and-place-order
	 * 
	 * @param newOrder
	 * @return
	 */
	@PostMapping("/checkout")
	public ResponseEntity<OrderSummry> checkoutAndPlaceOrder(@Valid @RequestBody OrderCommand newOrder) {

		return ResponseEntity.ok(checkoutService.checkoutAndPlaceOrder(newOrder));

	}

	@PostMapping("/test")
	public ResponseEntity<OrderSummry> checkoutAndPlaceOrder() {

		ProductEntity produt1 = productRepository.getById(22L);

		OrderItemEntity orderItem = OrderItemEntity.builder().product(produt1).quantity(1).build();

		List<OrderItemEntity> items = new ArrayList<OrderItemEntity>();
		items.add(orderItem);

		UserEntity user = userRepository.getById(1L);

		cartService.addMockItemToCart(items, user);
		return null;

	}
}
