package Basics;

public class factorial {

	public static void main(String[] args) {
		System.out.println("Factorial : " + fact(3));
		System.out.println("series : " + fibo(7));

	}
	static int fact(int n ) {
		if ( n ==0 ) {
			return 1 ; 
			
		}
		return (n* fact(n-1));
	}
		
		// now come to fibo 
		
		public static   int fibo( int r ) 
		{
			if ( r == 0 ) {
				return 0 ; 
				
			}
			else if ( r==1 ) {
				return 1 ; 
				
			}
			return ( fibo ( r-1)+ fibo ( r - 2)) ;
			
			
			
		}
	}
	
