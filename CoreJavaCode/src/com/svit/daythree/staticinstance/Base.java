package com.svit.daythree.staticinstance;

public class Base {

	public static void display() 
	{
        System.out.println("Static or class method from Base");
    }
     
     // Non-static method which will be overridden in derived class
     public void print()  
     {
         System.out.println("Instance method from Base");
         
     }
}
