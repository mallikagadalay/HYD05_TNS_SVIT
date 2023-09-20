package com.svit.dayseven.interfaceconcepts;

public class FinalVariable {
	

	final int speedlimit=90; // constant
	
	void run() 
	{
		// speedlimit=125;   // Shows error because final variables becomes constant.
	}
	
	public static void main(String[] args) {
		
		FinalVariable obj = new FinalVariable();
		obj.run();
		
	}

}
