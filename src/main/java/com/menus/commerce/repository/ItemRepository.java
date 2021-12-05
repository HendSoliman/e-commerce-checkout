package com.menus.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.menus.commerce.entity.OrderItemEntity;
import com.menus.commerce.entity.UserEntity;

@Repository
public interface ItemRepository extends JpaRepository<OrderItemEntity, Long> {

}
