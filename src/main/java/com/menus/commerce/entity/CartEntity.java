package com.menus.commerce.entity;

import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity
@Builder
@Table(name = "cart")
public class CartEntity {

	@Id
	@GeneratedValue
	@Column(name = "ID", updatable = false, nullable = false)
	private Long id;

	@OneToOne
	@JoinColumn(name = "USER_ID", referencedColumnName = "ID")
	private UserEntity user;

	@OneToMany(mappedBy = "cart", fetch = FetchType.LAZY)
	private List<OrderItemEntity> items = Collections.emptyList();





}
