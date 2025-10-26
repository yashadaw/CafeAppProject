package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.datamodel.OrderItem;
import com.example.demo.service.OrderItemImplements;

@RestController
public class OrderItemController {
	@Autowired
	OrderItemImplements ser;
	
	@PostMapping("/postorderitem")
	public OrderItem add(@RequestParam int menuid,@RequestParam int oid, @RequestParam int quantity) {
		return ser.addorder(menuid, oid, quantity);
		
	}

}
