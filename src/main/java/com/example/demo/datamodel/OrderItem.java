package com.example.demo.datamodel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity

public class OrderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oiid;
	private int quantity;
	private Double total;
	@ManyToOne
	private MenuItem menuitem;
	@ManyToOne
	private Order order;
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public OrderItem(int quantity, Double total, MenuItem menuitem, Order order) {
		super();
		this.quantity = quantity;
		this.total = total;
		this.menuitem = menuitem;
		this.order = order;
	}

	public OrderItem(int oiid, int quantity, MenuItem menuitem, Order order) {
		super();
		this.oiid = oiid;
		this.quantity = quantity;
		this.menuitem = menuitem;
		this.order = order;
	}
	public int getOiid() {
		return oiid;
	}
	public void setOiid(int oiid) {
		this.oiid = oiid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public MenuItem getMenuitem() {
		return menuitem;
	}
	public void setMenuitem(MenuItem menuitem) {
		this.menuitem = menuitem;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "OrderItem [oiid=" + oiid + ", quantity=" + quantity + ", menuitem=" + menuitem + ", order=" + order
				+ "]";
	}
	
	

}
