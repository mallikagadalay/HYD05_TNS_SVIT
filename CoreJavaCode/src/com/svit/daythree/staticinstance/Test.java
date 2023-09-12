package com.svit.daythree.staticinstance;

public class Test {

	public static void main(String[] args) {
		
		Base obj = new Derived();
				
		obj.display(); // it will print the result present in Base --> display() because it is a static method overriding not possible
		obj.print();   // print() is instance method so overriding is possible
		
	
		
	}

}
