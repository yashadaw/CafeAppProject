package com.example.demo.service;

import com.example.demo.datamodel.Bill;

public interface BillInterface {
	Bill generateBill(int oid,String paymethod);

}
