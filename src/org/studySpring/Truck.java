package org.studySpring;

public class Truck extends Vehicle {
	
	private String steering;
	private String musicSystem;
	private String seatBelt;
	private String airConditioner;
	private String container;
	public Truck() {
		super();
	}
	public Truck(String steering, String musicSystem, String seatBelt, String airConditioner, String container) {
		super();
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.seatBelt = seatBelt;
		this.airConditioner = airConditioner;
		this.container = container;
	}
	public String getSteering() {
		return steering;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public String getSeatBelt() {
		return seatBelt;
	}
	public String getAirConditioner() {
		return airConditioner;
	}
	public String getContainer() {
		return container;
	}
	
	@Override
	public void run() {
		System.out.println("truck is running");
	}
	

}
