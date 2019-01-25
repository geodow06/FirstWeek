package app;

public class BottlesOfMilk 
{
	public static void main(String[] args) {
		int noOfBottles = 100;
		
		
		while (noOfBottles > 1)
		{
			noOfBottles--;
			System.out.println(noOfBottles + " green bottles sittign on the wall");
			System.out.println(noOfBottles + " green bottles sitting on the wall");
			
			System.out.println("and if one green bottle should accidently fall");
			System.out.println("There will be " + (noOfBottles -1) + " green bottles sitting on the wall");
		}
		System.out.println("There are no green bottles sitting on the wall");
	}
}