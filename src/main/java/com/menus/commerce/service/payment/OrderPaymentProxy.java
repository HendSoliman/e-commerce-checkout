package com.menus.commerce.service.payment;

import org.springframework.stereotype.Component;

@Component
public class OrderPaymentProxy {
	public void pay(String orderId, double paidPrice) {
		// call remote payment service
	}
}
