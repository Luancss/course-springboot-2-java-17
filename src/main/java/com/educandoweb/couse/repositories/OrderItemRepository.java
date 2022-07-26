package com.educandoweb.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.couse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
