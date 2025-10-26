package com.example.demo.datamodel;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private double totalamount;
	private String paymethod;
	private LocalDate genneratedat;
	@OneToOne
	private Order ord;
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bill(int bid, double totalamount, String paymethod, LocalDate genneratedat, Order ord) {
		super();
		this.bid = bid;
		this.totalamount = totalamount;
		this.paymethod = paymethod;
		this.genneratedat = genneratedat;
		this.ord = ord;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public double getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}
	public String getPaymethod() {
		return paymethod;
	}
	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}
	public LocalDate getGenneratedat() {
		return genneratedat;
	}
	public void setGenneratedat(LocalDate genneratedat) {
		this.genneratedat = genneratedat;
	}
	public Order getOrd() {
		return ord;
	}
	public void setOrd(Order ord) {
		this.ord = ord;
	}
	@Override
	public String toString() {
		return "Bill [bid=" + bid + ", totalamount=" + totalamount + ", paymethod=" + paymethod + ", genneratedat="
				+ genneratedat + ", ord=" + ord + "]";
	}
	
	

}
