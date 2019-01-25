package app;

public class Car extends Vehicle {

	@Override
	public void topSpeed() {
		System.out.println("Fast!");

	}

	@Override
	public void accelerate() {
		System.out.println("Getting Fast");
		

	}

	@Override
	public void startMethod() {
		System.out.println("Ignition");

	}
	
	public Car(String colour,  String make,String model, int numberOfWheels, int numberOfDoors, int numberOfGears,
			int timeSpent) {
		super(colour, model, numberOfWheels, numberOfDoors, make, numberOfGears, timeSpent);
		
	} 
	
	
		
	

}
