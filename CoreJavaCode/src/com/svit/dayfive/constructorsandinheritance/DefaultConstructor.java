package com.svit.dayfive.constructorsandinheritance;

public class DefaultConstructor {

	private String doors;
	private String engine;
	private String driver;
	private int speed;

	public DefaultConstructor()
	
	{
		doors = "Closed";
		engine = "ON";
		driver = "Seated";
		speed = 25;
	}
	
	public String run()
	{
		if(doors.equals("Closed") && engine.equals("ON")&& driver.equals("Seated") && speed >0) 
		{
			return "Car is running";
		}
		else
		{
			return "Car is not running";
		}
	}
}
