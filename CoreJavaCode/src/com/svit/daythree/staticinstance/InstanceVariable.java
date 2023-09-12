package com.svit.daythree.staticinstance;

public class InstanceVariable {

	static int a = 10; 		// static variable
	int b = 30;		// instance variable
	
	void callme() // instance method

 { 
		System.out.println("Value of a = "+ a);
		System.out.println("Value of b = "+ b);
 }
}
