package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.datamodel.Bill;
import com.example.demo.service.BillImplements;

@RestController
public class BillController {
	@Autowired
	BillImplements billser;
	
	@PostMapping("/placeorder")
	public Bill generate(@RequestParam int oid, @RequestParam String paymethod) {
		return billser.generateBill(oid, paymethod);
		
	}

}
