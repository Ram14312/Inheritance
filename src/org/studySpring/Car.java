package org.studySpring;

public class Car extends Vehicle {
	private String steering;
	private String musicSystem;
	private int seatBelt;
	private String airConditioner;
	private String fridge;
	private String entertainmentSystem;
	public Car() {
		super();
	}
	public Car(String steering, String musicSystem, int seatBelt, String airConditioner, String fridge,
			String entertainmentSystem, String engine, int fuelTank, int seat, int bulb, String wheels) {
		super(engine, fuelTank,  seat, bulb, wheels);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.seatBelt = seatBelt;
		this.airConditioner = airConditioner;
		this.fridge = fridge;
		this.entertainmentSystem = entertainmentSystem;
	}
	public String getSteering() {
		return steering;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public int getSeatBelt() {
		return seatBelt;
	}
	public String getAirConditioner() {
		return airConditioner;
	}
	public String getFridge() {
		return fridge;
	}
	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}
	@Override
	public String toString() {
		return "Car [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem() + ", getSeatBelt()="
				+ getSeatBelt() + ", getAirConditioner()=" + getAirConditioner() + ", getFridge()=" + getFridge()
				+ ", getEntertainmentSystem()=" + getEntertainmentSystem() + ", getEngine()=" + getEngine()
				+ ", getFuelTank()=" + getFuelTank() + ", getSeat()=" + getSeat() + ", getBulb()=" + getBulb()
				+ ", getWheels()=" + getWheels() + "]";
	}
	
	@Override
	public void run() {
		System.out.println("car is running");
	}
	
	
	
	
	
	
	
	
	
	

}
