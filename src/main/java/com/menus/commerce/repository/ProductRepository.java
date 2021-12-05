package com.menus.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.menus.commerce.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
