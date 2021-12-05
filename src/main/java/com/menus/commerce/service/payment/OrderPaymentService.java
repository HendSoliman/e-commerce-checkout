package com.menus.commerce.service.payment;

import org.springframework.stereotype.Component;

import com.menus.commerce.entity.OrderEntity;

@Component
public class OrderPaymentService {
	private final OrderPaymentProxy paymentProxy;

	public OrderPaymentService(OrderPaymentProxy paymentProxy) {
		this.paymentProxy = paymentProxy;
	}

	public void pay(OrderEntity order, double paidPrice) {

		paymentProxy.pay(order.getId(), paidPrice);
	}
}
