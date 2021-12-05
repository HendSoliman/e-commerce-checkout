package com.menus.commerce.dto.command;

import lombok.Value;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Value
public class OrderItemDto {
	@NotBlank(message = "Product ID ")
	private String productId;

	@Min(value = 1, message = "Count should be more than 0")
	private int count;

	@NotNull(message = "dddd")
	private BigDecimal itemPrice;

	private boolean isAvailable;

}
