package app;

public abstract class Animal  
{
	public abstract void eat(); 
	public abstract void sleep(); 
	public abstract void reproduce(); 
	
	private String colour; 
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getNoOfLegs() {
		return noOfLegs;
	}
	public void setNoOfLegs(String noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	private String noOfLegs; 
	private String height;
}
