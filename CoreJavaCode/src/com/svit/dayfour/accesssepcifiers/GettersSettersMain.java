package com.svit.dayfour.accesssepcifiers;

public class GettersSettersMain {

	public static void main(String[] args) {


		GettersSetters obj = new GettersSetters();
		
		obj.setSpeed(50);
		System.out.println(obj.getSpeed());
		
		obj.setDrivers("A");
		System.out.println(obj.getDrivers());
		
		obj.setEngine("On");
		System.out.println(obj.getEngine());
		
		obj.setDoors("Closed");
		System.out.println(obj.getDoors());
		
	}

}
