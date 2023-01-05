package com.csi.protectedjava;

import com.csi.core.State;

public class City extends State {

	public static void main(String[] args) {
		City city = new City();

		System.out.println("\n State Id :" + city.stateId + "\n State Name :" + city.stateName + "\n State Office :"
				+ city.stateOffice + "\n State Revenue :" + city.stateRevenue + "\n State CM : " + city.StateCM);
	}
}
