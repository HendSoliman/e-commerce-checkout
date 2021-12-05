package com.menus.commerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.menus.commerce.entity.CartEntity;

public interface CartRepository extends JpaRepository<CartEntity, Long> {

	void deleteByUserId(long userId);

	Optional<CartEntity> findByUserId(long userId);

}
