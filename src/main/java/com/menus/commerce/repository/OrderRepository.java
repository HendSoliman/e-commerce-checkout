package com.menus.commerce.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.menus.commerce.entity.OrderEntity;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, UUID> {

}
