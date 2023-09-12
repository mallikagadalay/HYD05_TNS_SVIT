package com.svit.daythree.staticinstance;

public class StaticInstanceVariables {

	static int itemNumber;
	static int price;
	String item;
	

	public static void main(String[] args) {

		StaticInstanceVariables.itemNumber = 1;
		// itemNumber = 2; --> Can be written in this way too
		System.out.println("Item Number: " + itemNumber);
		
		price = 30;
		System.out.println("Price of item: " + price);
		
		StaticInstanceVariables obj = new StaticInstanceVariables();
		obj.item = "Milk";
		System.out.println("Item: " + obj.item);
	}

}
