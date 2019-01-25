package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hangman {
	static boolean gameOver = false;
	public static void main(String[] args) 
	{
	Scanner word = new Scanner(System.in); 
	
	
	String test = word.nextLine();
	int tries = 0; 
	List<Character> correctGuess = new ArrayList<Character>(); 
	List<Character> guesses = new ArrayList<Character>(); 
	List<Character> theWord = new ArrayList<Character>();
	for(int i=0;i<test.length();i++) { 
		correctGuess.add('_'); 
		
	}  
	for(int l=0 ; l<test.length() ; l++) { 
		theWord.add(test.charAt(l));
	}
	while(!gameOver) {  

		for (int j=0;j<7;j++) {  
			
			for(int z=0; z<correctGuess.size();z++)  
			{ 
				System.out.print(correctGuess.get(z)+" "); 
			}
//				System.out.println(correctGuess); 
			System.out.println();
			System.out.println(" "+guesses);
			Scanner guess = new Scanner(System.in); 
			char guessTest = guess.next().charAt(0); 
			if((int)guessTest <123 && (int)guessTest >96)  
			{  
				guesses.add((char)guessTest);
				for(int k = 0; k < test.length(); k++)
				{ 
					
					
					
					for(int n=0 ; n<correctGuess.size() ; n++)  
					{  
						if(guessTest==(int)test.charAt(n))  
						{ 
							
							correctGuess.set(n, (char)guessTest);  
						} 
						else  
						{ 
							tries++;  
//							System.out.println("incorrect guess");
							
						}
					}
						
					
					
					
				}
				
			}
			else {
				tries++;
				//continue;
				
			}
		}
		if(tries >= 3)
		{
			gameOver=true;
		}
		
	}
	}
	
}
