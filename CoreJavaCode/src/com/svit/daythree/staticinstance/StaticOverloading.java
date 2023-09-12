package com.svit.daythree.staticinstance;

public class StaticOverloading {

	public static void temp()
	{
		System.out.println("No parameters for this method!!");
	}
	
	public static void temp(int a) 
	{
		System.out.println("Value of a = "+ a);
	}
	
	public static void temp(int a,String name)
	{
		System.out.println("Roll no is "+ a);
		System.out.println("Name of candidate is " + name);
	}
	
	
public static void main(String[] args) {
		

	StaticOverloading.temp();
	// temp();  --> Can be accessed in this way too
	StaticOverloading.temp(10);
	StaticOverloading.temp(16,"Mallika");
	
	}

}
