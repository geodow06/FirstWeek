package app;

public abstract class Vehicle  
{
	public abstract void topSpeed(); 
	public abstract void accelerate(); 
	public abstract void startMethod(); 
	
	private String colour; 
	private String model; 
	private int numberOfWheels;
	private int numberOfDoors; 
	private String make; 
	private int numberOfGears; 
	private int timeSpent; 
	
	public Vehicle(String colour, String model, int numberOfWheels, int numberOfDoors, String make, int numberOfGears,
			int timeSpent) {
		super();
		this.colour = colour;
		this.model = model;
		this.numberOfWheels = numberOfWheels;
		this.numberOfDoors = numberOfDoors;
		this.make = make;
		this.numberOfGears = numberOfGears;
		this.timeSpent = timeSpent;
	}
	public int getTimeSpent()  
	{ 
		return timeSpent;
	} 
	
	public void setTimeSpent(int timeSpent)  
	{ 
		this.timeSpent=timeSpent;
	}
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getModel() {
		return model;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public int getNumberOfGears() {
		return numberOfGears;
	}
	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}
}
