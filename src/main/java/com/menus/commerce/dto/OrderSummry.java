package com.menus.commerce.dto;

import java.time.Instant;

import com.menus.commerce.entity.Address;
import com.menus.commerce.entity.OrderEntity;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class OrderSummry {

	private String id;
	private double totalPrice;
	private String status;
	private Instant createdAt;
	private Address address;

	public static OrderSummry fromEntityToDTo(OrderEntity createdOrder) {

		return OrderSummry.builder().address(createdOrder.getAddress()).createdAt(createdOrder.getCreatedAt())
				.id(createdOrder.getId()).totalPrice(createdOrder.getTotalPrice())
				.status(createdOrder.getStatus().toString()).createdAt(createdOrder.getCreatedAt())

				.build();
	}
}
