package com.menus.commerce.dto.command;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.menus.commerce.entity.Address;
import com.menus.commerce.entity.CardEntity;

import lombok.Value;

@Value
public class OrderCommand {

	@Valid
	@NotEmpty(message = "Should contain items")
	private List<OrderItemDto> items;

	@NotNull(message = "Address should not be empty")
	private Address address;

	private Long customerId;

	private CardEntity card;

}
