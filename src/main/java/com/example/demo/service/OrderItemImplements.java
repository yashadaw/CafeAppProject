package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MenuRepository;
import com.example.demo.dao.OrderItemRepository;
import com.example.demo.dao.OrderRepository;
import com.example.demo.datamodel.MenuItem;
import com.example.demo.datamodel.Order;
import com.example.demo.datamodel.OrderItem;

@Service
public class OrderItemImplements implements OrderItemInterface {
    @Autowired
    OrderItemRepository orderrepository;
    @Autowired
    MenuRepository mrepo;
    
    @Autowired
    OrderRepository orderrepo;

	@Override
	public OrderItem addorder(int menuid, int oid, int quantity) {
		// TODO Auto-generated method stub
		MenuItem mi=mrepo.findById(menuid).orElseThrow(()->new RuntimeException("menu not found"));
		Order o=orderrepo.findById(oid).orElseThrow(()-> new RuntimeException("order not found"));
		Double total=mi.getPrice()*quantity;
		OrderItem oitem=new OrderItem();
		oitem.setQuantity(quantity);
		oitem.setMenuitem(mi);
		oitem.setTotal(total);
//		oitem.setOrder(o);
		return orderrepository.save(oitem);
	}
	

}
