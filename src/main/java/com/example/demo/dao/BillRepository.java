package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.datamodel.Bill;

public interface BillRepository extends JpaRepository<Bill, Integer>{

}
