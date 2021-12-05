package com.menus.commerce.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)

@Entity
@Table(name = "address")

@Data
public class Address {

	@Id
	@GeneratedValue
	@Column(name = "ID", updatable = false, nullable = false)
	private Long id;

	private String province;
	private String city;
	private String detail;

	private Address(String province, String city, String detail) {
		this.province = province;
		this.city = city;
		this.detail = detail;
	}

	public static Address of(String province, String city, String detail) {
		return new Address(province, city, detail);
	}

	public Address changeDetailTo(String detail) {
		return new Address(this.province, this.city, detail);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Address address = (Address) o;
		return province.equals(address.province) && city.equals(address.city) && detail.equals(address.detail);
	}

	@Override
	public int hashCode() {
		return Objects.hash(province, city, detail);
	}

	public String getProvince() {
		return province;
	}

	public String getCity() {
		return city;
	}

	public String getDetail() {
		return detail;
	}

}
