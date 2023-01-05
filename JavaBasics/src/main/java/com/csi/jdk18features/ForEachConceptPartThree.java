package com.csi.jdk18features;

import java.util.ArrayList;
import java.util.List;

class Mob
{
	private int mobId;
	private String mobName;
	private double mobPrice;
	private String mobCompany;

	public Mob(int mobId,String mobName,double mobPrice, String mobCompany) {
		super();
		this.mobId = mobId;
		this.mobName = mobName;
		this.mobPrice = mobPrice;
		this.mobCompany = mobCompany;
	}


	public int getMobId() {
		return mobId;
	}

	public void setMobId(int mobId)	{
		this.mobId = mobId;
	}

	public String getMobName() {
		return mobName;
	}
	
	public void setMobName(String mobName) {
		this.mobName = mobName;
	}
	
	public double getMobPrice() {
		return mobPrice;
	}
	
	public void setMobPrice(double mobPrice) {
		this.mobPrice = mobPrice;
	}
	
	public String getMobCompany() {
		return mobCompany;
	}
	
	public void setMobCompany(String mobCompany) {
		this.mobCompany = mobCompany;
	}


	@Override
	public String toString() {
		return "Mob [mobId=" + mobId + ", mobName=" + mobName + ", mobPrice=" + mobPrice + ", mobCompany=" + mobCompany
				+ "]";
	}
	
	

}
public class ForEachConceptPartThree {
	
	public static void main(String[] args) {
		List<Mob> mobList = new ArrayList<Mob>();
		
		mobList.add(new Mob(100, "Moto g31", 4110.30, "Motorola"));
		mobList.add(new Mob(200, "Vivo v34", 2800.40, "Vivo"));
		mobList.add(new Mob(300, "Oppo f19", 5600.20, "Oppo"));
		mobList.add(new Mob(400, "Samsung M12", 8300.2, "Samsung"));
		mobList.add(new Mob(500, "OnePlus Nord 20 CE", 12000.2, "OnePlus"));
		
		// System.out.println(mobList);
		
		// mobList.forEach(m -> System.out.println(m));
		
		 mobList.forEach(System.out::println);
		
		/*
		 * for(Mob mob : mobList) { if(mob.getMobPrice() < 5000) {
		 * System.out.println(mob); } }
		 */
		
	}

}
