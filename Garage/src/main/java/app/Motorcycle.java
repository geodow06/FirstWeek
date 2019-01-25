package app;

public class Motorcycle extends Vehicle {

	@Override
	public void topSpeed() {
		System.out.println("100");

	}

	@Override
	public void accelerate() {
		System.out.println("Very Fast");
		

	}

	@Override
	public void startMethod() {
		System.out.println("Ignition");

	}

	public Motorcycle(String colour, String make, String model, int numberOfWheels, int numberOfDoors, int numberOfGears, int timeSpent) {
		super(colour, model, numberOfWheels, numberOfDoors, make, numberOfGears, timeSpent);
		
	}
	
	
	

}
