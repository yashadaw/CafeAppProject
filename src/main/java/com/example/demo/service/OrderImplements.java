package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MenuRepository;
import com.example.demo.dao.OrderItemRepository;
import com.example.demo.dao.OrderRepository;
import com.example.demo.datamodel.MenuItem;
import com.example.demo.datamodel.Order;
import com.example.demo.datamodel.OrderItem;

@Service
public class OrderImplements implements OrderInterface{
	@Autowired
	OrderRepository orepo;
	OrderItemRepository orrepo;
	@Autowired
	MenuRepository menurepo;
	

	@Override
	public Order placeOrder(Order order,List<Integer> menuid) {
		// TODO Auto-generated method stub
		order.setOrderdate(LocalDateTime.now());
		order.setStatus("placed");
		List<MenuItem> menu= menurepo.findAllById(menuid);
		order.setGetmenu(menu);
		
		
		
		
		return orepo.save(order);
	}
	
	

}
