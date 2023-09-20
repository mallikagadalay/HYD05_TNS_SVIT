package com.svit.dayseven.interfaceconcepts;

public class super2main extends super2{
	
	void eat()
	{
		System.out.println("eating bread...");
	}  
	
	void bark()
	{
		System.out.println("barking...");
	}  
	
	void work()
	{  
	super.eat();  
	bark();  
	eat();
	}  
	
	public static void main(String[] args) {
		super2main a1 = new super2main();
		a1.work();
	}

}
