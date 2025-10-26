package com.example.demo.dto;

public class OrderDto {
	private String customername;

	public OrderDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDto(String customername) {
		super();
		this.customername = customername;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	@Override
	public String toString() {
		return "OrderDto [customername=" + customername + "]";
	}
	

}
