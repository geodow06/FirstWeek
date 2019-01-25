package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Vehicle Henry = new Motorcycle("green","Mk ultra","23",3,4,200,30); 
		Vehicle George = new Car("Silver","Audi","A5",3,3,2,10000);
		double rate = 0.79;
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();  
		vehicles.add(Henry);
		vehicles.add(George);
		for(Vehicle i : vehicles)  
		{ 
			 
			System.out.println("The "+i.getColour()+" "+i.getMake()+" "+i.getModel()+" owes "+(rate*i.getTimeSpent()-rate*i.getTimeSpent()%1)+" Dollars and "+(rate*i.getTimeSpent()%1*100)/1+" cents.");
			
		}

		
		
		
//		Henry.topSpeed(); 
//		System.out.println(Henry.getColour()); 
//		George.topSpeed(); 
//		System.out.println(George.getColour());

	}

}
