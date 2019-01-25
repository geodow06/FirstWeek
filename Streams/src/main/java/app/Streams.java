package app;

import java.util.Arrays;
import java.util.List;

public class Streams {

	public static void main(String[] args) 
	{
		findMin(); 
		findMax();  
		onlyEven(); 
		onlyOdd(); 
		sum(); 
		leastOddSquare();
		
	} 
	static void findMin()  
	{  
		int minValue=0;
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20); 
//		minValue=numbers.stream().reduce((x,y)-> x.compareTo(y)<=0 ? x : y).get(); 
		minValue=numbers.stream().reduce(Math::min).get();
		System.out.println(numbers); 
		System.out.println(minValue);
	} 
	static void findMax()  
	{ 
		int maxValue=0;
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20); 
//		maxValue=numbers.stream().reduce((x,y)-> x.compareTo(y)>=0 ? x : y).get(); 
		maxValue=numbers.stream().reduce(Math::max).get();
		System.out.println(numbers); 
		System.out.println(maxValue);
	}
	static void onlyEven()  
	{ 
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);  
		numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	} 
	static void onlyOdd()  
	{ 
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20); 
		numbers.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
	} 
	static void sum()  
	{ 
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20); 
		int sum = numbers.stream().reduce(numbers.size(), Math::sum); 
		
	} 
	static void leastOddSquare() 
	{ 
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20); 
		int numLOS = numbers.stream().filter(x -> x*x % 2 != 0).reduce(numbers.size(), Math::min);
		System.out.println(numLOS);
	}
	
}
