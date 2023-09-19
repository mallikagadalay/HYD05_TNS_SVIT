package com.svit.dayfive.constructorsandinheritance;

public class MultipleInheritance3 extends MultipleInheritance2 implements MultipleInheritance1{

	String language = "Java";

	  // implement method of interface
	  public void connectServer() {
	    System.out.println(language + " can be used as backend language.");
	  }

	  public static void main(String[] args) {

	    // create object of Language class
		 MultipleInheritance3 java = new MultipleInheritance3();

	    java.connectServer();
	    // call the inherited method of Frontend class
	    java.responsive(java.language);
	  }
	  }
