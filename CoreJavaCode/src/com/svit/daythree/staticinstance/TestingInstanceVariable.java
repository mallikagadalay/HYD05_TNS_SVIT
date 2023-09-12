package com.svit.daythree.staticinstance;


public class TestingInstanceVariable {

	public static void main(String[] args) {
		
		InstanceVariable obj = new InstanceVariable();
		obj.callme();
		System.out.println("This is Testing part!!");
		System.out.println("Adding a and b = " + (obj.b + InstanceVariable.a));
		System.out.println(InstanceVariable.a);
		
	}

}
