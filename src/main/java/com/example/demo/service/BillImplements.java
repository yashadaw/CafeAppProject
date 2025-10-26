package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BillRepository;
import com.example.demo.dao.OrderRepository;
import com.example.demo.datamodel.Bill;
import com.example.demo.datamodel.Order;
import com.example.demo.datamodel.OrderItem;
@Service
public class BillImplements implements BillInterface{
	@Autowired
	BillRepository billrepo;
	@Autowired
	OrderRepository orderrepo;
	

	@Override
	public Bill generateBill(int oid, String paymethod) {
		// TODO Auto-generated method stub
		Order o1=orderrepo.findById(oid).orElseThrow(()->  new RuntimeException("order not found"));
		double total=0.0;
		for(OrderItem oi:o1.getOrderitem()) {
			
			 total+=oi.getQuantity()*oi.getMenuitem().getPrice();
	
		}
		Bill bill=new Bill();
		bill.setTotalamount(total);
		bill.setPaymethod(paymethod);
	
		return billrepo.save(bill);
	}

}
