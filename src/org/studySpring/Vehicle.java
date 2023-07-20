package org.studySpring;

public class Vehicle {

	 private String engine;
	 private int fuelTank;
	 private int seat;
	 private int bulb;
	 private String wheels;
	public Vehicle() {
		this.engine = "diesel";
		this.fuelTank = 10;
		this.seat = 4;
		this.bulb = 4;
		this.wheels = "flat"; 
	}
	public Vehicle(String engine, int fuelTank, int seat, int bulb, String wheels) {
		this.engine = engine;
		this.fuelTank = fuelTank;
		this.seat = seat;
		this.bulb = bulb;
		this.wheels = wheels;
	}
	public String getEngine() {
		return engine;
	}
	public int getFuelTank() {
		return fuelTank;
	}
	public int getSeat() {
		return seat;
	}
	public int getBulb() {
		return bulb;
	}
	public String getWheels() {
		return wheels;
	}
	
	public void run() {
		System.out.println("vehicle is running");
	}
	 
	
	 
	 
}
