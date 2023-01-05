package com.csi.jdk18features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.mysql.cj.xdevapi.AddResultImpl;

class Prod
{
	private int prodId;
	private String prodName;
	private double prodPrice;
	
	public Prod (int prodId, String prodName, double prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}
	
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
	public double getProdPrice() {
		return prodPrice;
	}
	
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	@Override
	public String toString() {
		return "Prod [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + "]";
	}
	
	
}

public class StreamAPICoreConceptThree {
	
	public static void main(String[] args) {
		
		List<Mob> mobList = new ArrayList<Mob>();
		
		mobList.add(new Mob(21, "Nokia x2", 15000.32,"Nokia" ));
		mobList.add(new Mob(22, "Samsung j21", 12000.21, "Samsung"));
		mobList.add(new Mob(23, "Moto E12", 8000.31, "Motorola"));
		mobList.add(new Mob(24, "Oppo Reno 54", 7500.98, "Oppo"));
		mobList.add(new Mob(25, "Vivo v23", 18000.30, "Vivo"));
		mobList.add(new Mob(26, "Nokia c1", 9300.56, "Nokia"));
		
	//	System.out.println(mobList);
		
	//	mobList.forEach(m -> System.out.println(m));
		
	//	mobList.forEach(System.out::println);
		
    //  mobList.stream().filter(mob -> mob.getMobPrice() >= 10000).forEach(System.out::println);
		
	//	mobList.stream().filter(mob -> mob.getMobPrice() >= 10000).forEach(m -> System.out.println(m.getMobId()));

	//	System.out.println(mobList.size());
		
	
	/*
	 * long count = mobList.stream().collect(Collectors.counting());
	 * 
	 * System.out.println(count);
	 * 
	 */
		
	}

}
