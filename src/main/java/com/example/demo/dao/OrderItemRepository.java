package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.datamodel.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
