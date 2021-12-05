package com.menus.commerce.entity;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {

	
	
	@Id
	@GeneratedValue
	@Column(name = "ID", updatable = false, nullable = false)
	private Long id;

	@NotNull(message = "Product name is required.")
	@Basic(optional = false)
	@Column(name = "NAME")
	private String name;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "PRICE")
	private BigDecimal price;

	@Column(name = "COUNT")
	private int count;

	@OneToMany(mappedBy = "product")
	private List<OrderItemEntity> items;
}
