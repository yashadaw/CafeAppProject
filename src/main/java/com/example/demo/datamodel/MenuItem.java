package com.example.demo.datamodel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MenuItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int menuid;
	private String name;
	private double price;
	private String category;
	public MenuItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MenuItem(int menuid, String name, double price, String category) {
		super();
		this.menuid = menuid;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "MenuItem [menuid=" + menuid + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	

}
