package Basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		System.out.println("program is starting ");
		System.out.println(fib(9));
		System.out.println("program ended ");
	}
public static int fib (int n) {
	if(n == 0) {
		return 0 ;
		
	}
 
else if (n == 1 ){
	return 1 ;
}
return (fib (n-1) + fib (n-2));

}
}

