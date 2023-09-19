package com.svit.daysix.oopsconcepts;

public class polymorphism3 {


	// method without parameter
	  public void display() {
	    for (int i = 0; i < 10; i++) {
	      System.out.print("*");
	    }
	  }

	  // method with single parameter
	  public void display(char symbol) {
	    for (int i = 0; i < 10; i++) {
	      System.out.print(symbol);
	    }
	  }
}
