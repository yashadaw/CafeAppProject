package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.datamodel.Order;

public interface OrderRepository  extends JpaRepository<Order, Integer>{

}
