package com.csi.publicconcept;

import com.csi.core.PublicCar;

public class CarInformation {

	public static void main(String[] args) {
		PublicCar publicCar = new PublicCar();

		System.out.println("\n Car Id : " + publicCar.carId + "\n Car Name : " + publicCar.carName + "\n Car Body : "
				+ publicCar.carBody + "\n Car Color : " + publicCar.carColor + "\n Car Model Year : "
				+ publicCar.carModelYear + "\n Car Code : " + publicCar.carCode + "\n Car Contact Number : "
				+ publicCar.carContactNumber + "\n Car Status : " + publicCar.carStatus);
	}
}
