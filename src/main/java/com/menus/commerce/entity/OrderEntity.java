package com.menus.commerce.entity;

import static com.menus.commerce.enumuration.OrderStatus.CREATED;
import static java.time.Instant.now;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.menus.commerce.enumuration.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class OrderEntity {

	@Id
	@GeneratedValue
	@Column(name = "ID", updatable = false, nullable = false)
	private String id;

	@OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
	private List<OrderItemEntity> items;

	private double totalPrice;
	private OrderStatus status;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ID", insertable = false, updatable = false)
	private Address address;

	private Instant createdAt;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_ID", nullable = false)
	private UserEntity userEntity;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PAYMENT_ID", referencedColumnName = "ID")
	private PaymentEntity paymentEntity;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "CARD_ID", referencedColumnName = "ID")
	private CardEntity cardEntity;

	@Column(name = "ORDER_DATE")
	private LocalDateTime orderDate;

	@OneToOne(mappedBy = "orderEntity")
	private AuthorizationEntity authorizationEntity;

	public static OrderEntity create(String id, List<OrderItemEntity> items, Address address, UserEntity user) {

// TODO Raise event of creation to order that send mail and notifications 
		return OrderEntity.builder().id(id).items(items).totalPrice(calculateTotalPrice(items)).status(CREATED)
				.address(address).createdAt(now()).userEntity(user).build();

	}

	private static double calculateTotalPrice(List<OrderItemEntity> items) {
		double totalCost = 0;
		for (OrderItemEntity item : items) {

			totalCost += item.totalPrice();
		}

		return totalCost;
	}
//	public void changeProductCount(String productId, int count) {
//		if (this.status == PAID) {
//			throw new OrderCannotBeModifiedException(this.id);
//		}
//
//		OrderItem orderItem = retrieveItem(productId);
//		int originalCount = orderItem.getCount();
//		orderItem.updateCount(count);
//		this.totalPrice = calculateTotalPrice(items);
////		raiseEvent(new OrderProductChangedEvent(id, productId, originalCount, count));
//	}
//
////
//	private OrderItem retrieveItem(String productId) {
//		return items.stream().filter(item -> item.getProductId().equals(productId)).findFirst()
//				.orElseThrow(() -> new ItemNotFoundException(productId, id));
//	}

//	public void pay(BigDecimal paidPrice) {
//		if (!this.totalPrice.equals(paidPrice)) {
//			throw new PaidPriceNotSameWithOrderPriceException(id);
//		}
//		this.status = PAID;
//		raiseEvent(new OrderPaidEvent(this.getId()));
//	}
//
//	public void changeAddressDetail(String detail) {
//		if (this.status == PAID) {
//			throw new OrderCannotBeModifiedException(this.id);
//		}
//
//		this.address = this.address.changeDetailTo(detail);
//		raiseEvent(new OrderAddressChangedEvent(getId(), detail, address.getDetail()));
//	}
//
//	public OrderRepresentation toRepresentation() {
//		List<com.ecommerce.order.sdk.representation.order.OrderItem> itemRepresentations = this.getItems().stream()
//				.map(orderItem -> new com.ecommerce.order.sdk.representation.order.OrderItem(orderItem.getProductId(),
//						orderItem.getCount(), orderItem.getItemPrice()))
//				.collect(Collectors.toList());
//
//		return new OrderRepresentation(this.getId(), itemRepresentations, this.getTotalPrice(), this.getStatus().name(),
//				this.getAddress(), this.getCreatedAt());
//	}
//
//	public OrderSummaryRepresentation toSummary() {
//		return new OrderSummaryRepresentation(this.getId(), this.getTotalPrice(), this.getStatus().name(),
//				this.getCreatedAt(), this.getAddress());
//	}

}
