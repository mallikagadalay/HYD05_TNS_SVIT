package com.svit.dayfour.accesssepcifiers;

public class GettersSettersAddFunctionalityMain {
	
	public static void main(String[] args) {
		
		GettersSettersAddFunctionality car = new GettersSettersAddFunctionality();
		car.setSpeed (10);
		car.setDoors ("closed");
		car.setEngine ("on");
		car.setDrivers ("seated");
		//calling the function
		System.out.println (car.run ());

}
}
