package com.svit.daythree.staticinstance;

public class StaticVariable {

		
		static int a = 10;
		static int b = 20;
		int c = 30;
		
		static void callme()
		{
			System.out.println("Value of a = "+a);
			// System.out.println("Value of c = " +c); --> It can't access this as it is instance variable
			
		}

	}


