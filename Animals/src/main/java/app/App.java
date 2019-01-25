package app;

public class App {

	public static void main(String[] args)  
	{
		
		Animal george = new Human();
		george.sleep(); 
		System.out.println(george.getClass()); 
		System.out.println(george.getColour());  
		System.out.println(george.getHeight()); 
		System.out.println(george.getNoOfLegs()); 
		
		
	}

}
