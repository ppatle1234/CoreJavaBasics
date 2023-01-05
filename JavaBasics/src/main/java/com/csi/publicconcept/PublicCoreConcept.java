package com.csi.publicconcept;

import com.csi.core.ProductConstants;

public class PublicCoreConcept {

	public static void main(String[] args) {

		ProductConstants productConstants = new ProductConstants();

		System.out.println("\n Product Id :" + productConstants.productId + "\n Product Name :"
				+ productConstants.productName + "\n Product Price :" + productConstants.productPrice
				+ "\n Product Address :" + productConstants.productAddress);

	}

}
