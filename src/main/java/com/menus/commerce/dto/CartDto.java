package com.menus.commerce.dto;

import java.util.List;

import com.menus.commerce.dto.command.OrderItemDto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CartDto {

	private List<OrderItemDto> cartItems;
	private double totalCost;

}
