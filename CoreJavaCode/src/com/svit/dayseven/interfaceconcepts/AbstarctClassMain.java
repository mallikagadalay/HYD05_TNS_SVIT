package com.svit.dayseven.interfaceconcepts;

public class AbstarctClassMain {

	public static void main(String[] args) {
		person john = new veg();
		john.speak();
		john.eat();
		System.out.println("=======================");
		person mia = new nonveg();
		mia.speak();
		mia.eat();
	}
}
