package com.svit.daythree.staticinstance;

public class TestingStaticVariable {

	public static void main(String[] args) {
		
		
		StaticVariable.callme();
		System.out.println("Value of a and b =" + StaticVariable.a + " " + StaticVariable.b);
		System.out.println("Addtition of a and b = " + (StaticVariable.a+StaticVariable.b));
	
	}

}
