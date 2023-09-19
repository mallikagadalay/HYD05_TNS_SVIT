package com.svit.dayfive.constructorsandinheritance;

public class SingleLevelInheritanceB extends SingleLevelInheritanceA{
	
	public void display()
	{
		System.out.println("This is Child Class !!");
	}

	public static void main(String[] args) {
		
		SingleLevelInheritanceB obj = new SingleLevelInheritanceB();
		obj.display();
		obj.print();
		
	}

}
