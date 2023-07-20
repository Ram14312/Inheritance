package org.studySpring;

public class Bike extends Vehicle{
	private String handler;

	public Bike() {
		super();
	}

	public Bike(String handler,String engine, int fuelTank, int seat, int bulb, String wheels) {
		super(engine, fuelTank, seat, bulb, wheels);
		this.handler = handler;
	}

	public String getHandler() {
		return handler;
	}

	@Override
	public String toString() {
		return "Bike [getHandler()=" + getHandler() + ", getEngine()=" + getEngine() + ", getFuelTank()="
				+ getFuelTank() + ", getSeat()=" + getSeat() + ", getBulb()=" + getBulb() + ", getWheels()="
				+ getWheels() + "]";
	}
	
	
	
	

}
