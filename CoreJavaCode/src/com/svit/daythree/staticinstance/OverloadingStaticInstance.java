package com.svit.daythree.staticinstance;

public class OverloadingStaticInstance {

	public static void temp()
	{
		System.out.println("Static Method !");
	}
	
  // public void temp() --> compiler error because static overriding not possible
	public void temp(int b)
	{
		System.out.println("Instance Method !");
	}
	
	
	
	public static void main(String[] args) {
		
		temp();  // Or OverloadingStaticInstance.temp()
		OverloadingStaticInstance obj = new OverloadingStaticInstance();
		obj.temp(12);
		

	}

}
