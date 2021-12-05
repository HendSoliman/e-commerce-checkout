package com.menus.commerce.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.menus.commerce.entity.OrderItemEntity;
import com.menus.commerce.exception.ErrorItem;
import com.menus.commerce.exception.NotFoundException;
import com.menus.commerce.exception.ViolationException;

@Component
public class OrderValidator extends AbstractValidator {

	@Value("${maxOrderBasketMoney}")
	private String maxOrderBasketMoney;

	@Value("${minOrderBasketMoney}")
	private String minOrderBasketMoney;

	public void validateOrderPayload(List<OrderItemEntity> orderItems) {

		double totalCost = 0;

		List<ErrorItem> subErrors = new ArrayList<ErrorItem>();

		// Validate the basket items availability.
		for (OrderItemEntity item : orderItems) {

			if (item.getProduct().getCount() < item.getQuantity()) {
				subErrors.add(new ErrorItem(item.getProduct().getName(), getMessage(NO_ENOUGH_STOCK)));

			} else
				totalCost += item.totalPrice();

		}

		if (!subErrors.isEmpty())
			throw new NotFoundException(subErrors);

		// check order total cost

		if (totalCost < Double.valueOf(minOrderBasketMoney) || totalCost > Double.valueOf(maxOrderBasketMoney)) {
			subErrors.add(new ErrorItem("Total Price", getMessage(MSG_KEY_ORDER_NOT_VLAID_TOTAL_COST)));
		}

		if (!subErrors.isEmpty())
			throw new ViolationException(subErrors);

	}

}
