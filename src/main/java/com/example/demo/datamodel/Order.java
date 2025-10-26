package com.example.demo.datamodel;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	private String customername;
    private LocalDateTime orderdate;
	private String status;
	@OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
	private List<OrderItem> orderitem;
	@OneToMany(cascade = CascadeType.ALL)
	private List<MenuItem> getmenu;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int oid, String customername, LocalDateTime orderdate, String status, List<OrderItem> orderitem) {
		super();
		this.oid = oid;
		this.customername = customername;
		this.orderdate = orderdate;
		this.status = status;
		this.orderitem = orderitem;
	}
	public int getOid() {
		return oid;
	}
	public List<MenuItem> getGetmenu() {
		return getmenu;
	}
	public void setGetmenu(List<MenuItem> getmenu) {
		this.getmenu = getmenu;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public LocalDateTime getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(LocalDateTime orderdate) {
		this.orderdate = orderdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<OrderItem> getOrderitem() {
		return orderitem;
	}
	public void setOrderitem(List<OrderItem> orderitem) {
		this.orderitem = orderitem;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", customername=" + customername + ", orderdate=" + orderdate + ", status="
				+ status + ", orderitem=" + orderitem + ", getmenu=" + getmenu + "]";
	}
	

}
