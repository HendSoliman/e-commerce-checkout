package com.menus.commerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.menus.commerce.service.OrderService;

@RestController
//@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

}
