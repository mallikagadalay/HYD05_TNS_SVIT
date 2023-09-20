package com.svit.dayseven.interfaceconcepts;

public class Iphone implements phone{

	@Override
	public String processor() 
	{
		return "A11";
	}

	@Override
	public String OS() 
	{
		return "IOS";
	}

	@Override
	public int spaceInGB() 
	{
		return 64;
	}

}
