package com.menus.commerce.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;



@Table(name = "payment")
@Entity
@Data
public class PaymentEntity {

	@Id
	@GeneratedValue
	@Column(name = "ID", updatable = false, nullable = false)
	private UUID id;

	@Column(name = "AUTHORIZED")
	private boolean authorized;

	@Column(name = "MESSAGE")
	private String message;

	@OneToOne(mappedBy = "paymentEntity")
	private OrderEntity orderEntity;

}
