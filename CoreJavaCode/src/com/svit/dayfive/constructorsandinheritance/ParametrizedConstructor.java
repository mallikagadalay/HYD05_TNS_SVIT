package com.svit.dayfive.constructorsandinheritance;

public class ParametrizedConstructor {

	private String doors;
	private String engine;
	private String driver;
	private int speed;
 
	//Parameterized constructor
	public ParametrizedConstructor(String doors, String engine, String driver, int speed) 
	{
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
 
	public String run() {
		if(doors.equals("closed") && engine.equals("on")&& driver.equals("seated") && speed >0) 
		{
			return "Car is running";
		}else 
		{
			return "Car is not running";
		}
	}
}
