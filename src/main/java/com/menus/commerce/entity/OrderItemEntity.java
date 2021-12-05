package com.menus.commerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "item")

@NoArgsConstructor
@AllArgsConstructor
public class OrderItemEntity {

	@Id
	@GeneratedValue
	@Column(name = "ID", updatable = false, nullable = false)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID")
	private ProductEntity product;

	@Column(name = "UNIT_PRICE")
	private double itemPrice;

	@Column(name = "QUANTITY")
	private int quantity;

	private boolean isAvailable;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "order_id", referencedColumnName = "id")
	private OrderEntity order;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "cart_id", referencedColumnName = "id")
	private CartEntity cart;

	public double totalPrice() {
		return itemPrice * quantity;
	}

	public void updateCount(int count) {
		this.quantity = count;
	}
}
