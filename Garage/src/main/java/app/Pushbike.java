package app;

public class Pushbike extends Vehicle {

	@Override
	public void topSpeed() {
		System.out.println("Depends on the bloke");

	}

	@Override
	public void accelerate() {
		System.out.println("not as fast as the others");
		

	}

	@Override
	public void startMethod() {
		System.out.println("Pedal boy, pedal!");

	}
	
	public Pushbike(String colour, String make, String model, int numberOfWheels, int numberOfDoors, int numberOfGears,
			int timeSpent) {
		super(colour, model, numberOfWheels, numberOfDoors, make, numberOfGears, timeSpent);
		
	} 
	

}
