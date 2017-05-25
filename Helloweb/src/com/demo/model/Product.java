package com.demo.model;

public class Product {
	private String productId;
	private String productName;
	private String productDescption;
	
	public Product() {
	}
	
	public Product(String productId, String productName, String productDescption) {
		this.productId = productId;
		this.productName = productName;
		this.productDescption = productDescption;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
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


	
	
	
}
