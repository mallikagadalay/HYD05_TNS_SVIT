package com.svit.daythree.staticinstance;

public class InstanceOverloading {
	
	public  void temp() 
	{
		System.out.println("No parameters method called !! ");
	}
	
	public  void temp(int a,float b) 
	{
		System.out.println("temp(int,float) method called !! ");
		System.out.println("Addition: " + (a+b));
	}
	
public static void main(String args[])
	{
		InstanceOverloading t1 = new InstanceOverloading();
		t1.temp();
		t1.temp(10,4.7f);
	}
}