package com.qa.projectTest;

public class App 
{ 
	static int handOne = 4; 
	static int handTwo = 5; 
	
    public static void main( String[] args )
    { 
    	blackjackHand(handOne, handTwo);
        
    } 
    public static int blackjackHand(int i, int j) {
		if(i<22&&j<22)  
		{	
    		if(i<j)  
			{ 
				return j; 
			}
			else if(i>j)
			{ 
				return i;
			} 
			else  
			{ 
				return 0;
			}  
		} 
		else if(i<22){ 
			return i;
		} 
		else if(j<22)
		{  
	
			return j;
		} 
		else 
		{ 
			return 0;
		}
		 
	
   	 
    }

	
}
