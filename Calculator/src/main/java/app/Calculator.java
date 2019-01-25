package app;

public class Calculator {
	public static void main(String[] args)
	{ 
		int a=0; 
		int b=0; 
		String operator=("hello");
		System.out.println(add(a,b)); 
		System.out.println(subtract(a,b)); 
		System.out.println(divide(a,b)); 
		System.out.println(multiply(a,b)); 
		System.out.println(mod(a,b));  
		System.out.println(calculate(a,b,operator));
	} 
	
	public static int add(int a, int b)  
	{ 
	
		return a+b;
	}  
	public static int subtract(int a, int b) 
	{ 
		return a-b; 
	} 
	public static int divide(int a, int b) 
	{ 
		return a/b; 
	}  
	public static int multiply(int a, int b) 
	{ 
		return a*b; 
	}  
	public static int mod(int a, int b) 
	{ 
		return a%b; 
	}  
	public static int calculate(int a, int b, String operator) 
	{ 
		if ("+".equals(operator)) 
		{ 
			return a+b;
		} 
		else if ("-".equals(operator))
		{ 
			return a-b;
		} 
		else if ("/".equals(operator))
		{ 
			return a/b;
		}  
		else if ("*".equals(operator))
		{ 
			return a*b;
		}  
		else if ("%".equals(operator))
		{ 
			return a%b;
		}  
		else 
		{ 
			return 80085;
		}
	}
}
