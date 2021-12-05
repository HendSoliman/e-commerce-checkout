package com.menus.commerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "card")
public class CardEntity {
	@Id
	@GeneratedValue
	@Column(name = "ID", updatable = false, nullable = false)
	private Long id;

	@Column(name = "NUMBER")
	private String number;

	@Column(name = "EXPIRES")
	private String expires;

	@Column(name = "CVV")
	private String cvv;

	@OneToOne
	@JoinColumn(name = "USER_ID", referencedColumnName = "ID")
	private UserEntity user;

	
	
}
