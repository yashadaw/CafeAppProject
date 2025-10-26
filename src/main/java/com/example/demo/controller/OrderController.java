package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.datamodel.Order;
import com.example.demo.dto.OrderDto;
import com.example.demo.service.OrderImplements;

@RestController
public class OrderController {
	@Autowired
	OrderImplements oser;
	
	@PostMapping("/addorder/{menuid}")
	public Order addOrder(@RequestBody Order order,@PathVariable  List<Integer> menuid) {
		return oser.placeOrder(order, menuid);
		
	}

}
