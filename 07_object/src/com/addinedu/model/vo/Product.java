package com.addinedu.model.vo;

public class Product {
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	//생성자 2
	Product() {
	}
	Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
		
	}
	
	
	Public void setproductId(String productId) {
		this.productId = productId;
	}
	String get productId() {
		return productId;
	}
	
	
}
