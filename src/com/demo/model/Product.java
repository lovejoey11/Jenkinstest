package com.demo.model;

public class Product {
	private int productId;
	private String productName;
	private String productDescption;
	private double productPrice;
	
	public Product() {
	}
	
	public Product(String productName,
			String productDescption, double productPrice) {
		super();
		
		this.productName = productName;
		this.productDescption = productDescption;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescption() {
		return productDescption;
	}

	public void setProductDescption(String productDescption) {
		this.productDescption = productDescption;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
}
