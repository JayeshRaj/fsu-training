package Basics;

public class NumberCalc {
	public static void main(String[] args) {
		/*int numA = 10 ;
		int numB = 20 ;
		name();
		addnumbers(numA, numB);
		int product = multiply( numA , numB);
		
		System.out.println("the product of numbers " + numA + " and " + numB  +  " is "   + product);
		
		
		
	}
	static void name() {
		System.out.println("My Name is Jayesh Raj");
		
	}
	static void addnumbers( int numberA, int numberB) {
		int sum = numberA + numberB ; 
		System.out.println("the sum of numbers " +numberA +" and " +numberB +" is " +sum);
		
	}
	static int multiply( int numberA , int numberB) {
		int product = numberA * numberB ;
		return product ; 
		
	} */

	String[] states = new String[2];
	states[0] = "california" ; 
	states[1] = "New York";
System.out.println(states[1]);
	System.out.println("**************");
	
	int i = 0 ;
	do {
		System.out.println(states[i]);
		i= i +1 ;
	}while(i<2);
	System.out.println("***$*&*^%$#***");
	int n = 0 ;
	boolean StateFound= false;
	while(!StateFound) {
		String state = states[n];
	
		System.out.println(state);
		if(state == "New York") {
			System.out.println("\n state found !! \n ");
			StateFound= true ; 
			
		}
		n++ ;
	}

	for (int x= 0 ; x<2 ; x++) {
		System.out.println(states[x]);
		
	}
	System.out.println("\n Hence again, Your state is here  !! \n " + states[1]);
	
	
	
	}
}