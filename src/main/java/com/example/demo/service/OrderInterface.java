package com.example.demo.service;

import java.util.List;

import com.example.demo.datamodel.Order;

public interface OrderInterface {
	Order placeOrder(Order order,List<Integer> menuid);

}
