package com.svit.dayseven.interfaceconcepts;

public class super1main extends super1 {

String color="black";
	
	void printColor(){  
		System.out.println(color);//prints color of Dog class  
		System.out.println(super.color);//prints color of Animal class  
	}  
	
	public static void main(String[] args) {
		
		super1main a1 = new super1main();
		a1.printColor();
		
	}
}
