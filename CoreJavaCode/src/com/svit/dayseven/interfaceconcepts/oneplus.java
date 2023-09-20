package com.svit.dayseven.interfaceconcepts;

public class oneplus implements phone {
	
	@Override
	public String processor() 
	{
		return "SD835";
	}

	@Override
	public String OS() 
	{
		return "Android";
	}

	@Override
	public int spaceInGB() 
	{
		return 64;
	}
	
	public static void main(String[] args) {
		phone oneplus = new oneplus();
		System.out.println("OS: "+ oneplus.OS());
		System.out.println("Processor: "+ oneplus.processor());
		System.out.println("spaceinGB: "+ oneplus.spaceInGB());
		
		phone ios = new Iphone();
		System.out.println("OS: "+ ios.OS());
		System.out.println("Processor: "+ ios.processor());
		System.out.println("spaceinGB: "+ ios.spaceInGB());
	}


}
