package org.studySpring;

public class Main {

	public static void main(String[] args) {
	    Bike b = new Bike("flat","petrol",5, 6, 7, "puncture");
	    System.out.println(b);
	    Car c = new Car("one", "boat", 2 , "lg", "empty","diesel","flat", 5, 6, 7, "puncture" );
	    System.out.println(c);
	    c.run();
	    b.run();
	    
	    
	    

	}

}
