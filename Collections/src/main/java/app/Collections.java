package app;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Collections {

	public static void main(String[] args) 
	{
		append121(); 
		append12999(); 
		multiply();
	}	
	static void append121() 
	{ 
		int a=0; 
		int b=1;
		int[] arrayOfInts = new int[100]; 
		for(int i=1;i<101;i++)  
		{  
			
			arrayOfInts[a] = b; 
			a++; 
			b++;
		} 
	System.out.println(Arrays.toString(arrayOfInts));
	} 
	static void append12999()  
	{ 
		int a=0; 
		int b=100; 
		int[] arrayOfInts2=new int[900]; 
		for(int i=1;i<901;i++)  
		{ 
			arrayOfInts2[a]=b; 
			a++; 
			b++; 
		
		} 
	System.out.println(Arrays.toString(arrayOfInts2));
	}
	static void multiply()  
	{ 
		
		int a=0; 
		int b=100; 
		int[] arrayOfInts2=new int[900]; 
		for(int i=1;i<901;i++)  
		{ 
			arrayOfInts2[a]=b; 
			a++; 
			b++; 
		}
		System.out.println(Arrays.toString(arrayOfInts2));
		int c=0; 
		int d=0;
		for(int j=1;j<901;j++)  
		{ 
			d=arrayOfInts2[c];
			arrayOfInts2[c]=10*d;
			c++;
		} 
		System.out.println(Arrays.toString(arrayOfInts2));
	}

}
