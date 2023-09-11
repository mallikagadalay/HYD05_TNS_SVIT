package com.svit.daytwo;

public class Operators {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		 int x = 10;
		 int z;
		// String e = "Equal to 10";
		// String n = "Not equal to 10";
		System.out.println("a and b value before the operations: " + a + " " + b);

	 // Arithmetic Operators
		
		System.out.println("a+b = " + (a+b));
		System.out.println("a-b = " + (a-b));
		System.out.println("a*b = " + (a*b));
		System.out.println("a/b = " + (a/b));
		System.out.println("a%b = " + (a%b));
		
	// 	Shift Operators
		
		System.out.println("Left shift a by 2: " + (a<<2));    // Value increases
		System.out.println("Right shift b by 3: " + (b>>3));   // Value decreases
		
				
	 // Unary Operator
		++a;  // a value is incremented and used then it stores 11 in a , a=11
		int c = ++a + b + a--;  // c = 12 + 20 + 12 = 44
		System.out.println("c value after the operations: " + c);

		int d = c++ + a + b--;  // d = 44 + 11 + 20 = 75
		System.out.println("d value after the operations: " + d);

		System.out.println("a , b,c,d values after the operations: " + a + " " + b + " " + c + " " + d);
				
	 //Ternary operator demonstration
		  x = (10 == x) ? 1 : 0;	
		  System.out.println(x);
		  
		  z = (10 > x) ? 1:0 ;	
		  System.out.println(z);

	}

}
