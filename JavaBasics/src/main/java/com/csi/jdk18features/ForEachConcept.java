package com.csi.jdk18features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product
{
	private int productId;
	private String productName;
	private double productPrice;
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
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
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
	
}

public class ForEachConcept {

	public static void main(String[] args) {
	
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product(101, "MI SmartPhone", 3000.30));
		productList.add(new Product(102, "MI TV", 23000.23));
		productList.add(new Product(103, "POCO F1", 8000.23));
		productList.add(new Product(104,  "Samsung s11", 6700.40));
		
	//	System.out.println(productList);
		
	/*
	 * for(Product product : productList) { if(product.getProductPrice() < 5000) {
	 * System.out.println(product); } }
	 */
		
	//	productList.forEach(p -> System.out.println(p));
		
	//	productList.forEach(System.out::println);
		
		Iterator<Product> itrIterator = productList.iterator();
		
		while (itrIterator.hasNext())
		{
			System.out.println(itrIterator.next());
		}
	}
}
