package com.svit.dayseven.interfaceconcepts;

public class FinalClassMain extends FinalClass  // Error occurs because inheritance not possible when final used in class creation.
	{

	void run() {
		System.out.println("Running safely with 100kmph");
	}
	
	public static void main(String[] args) {
		
		FinalClassMain f1 = new FinalClassMain();
		f1.run();
		
	}
}
