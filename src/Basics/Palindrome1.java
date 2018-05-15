package Basics;

import java.util.Scanner ;

public class Palindrome1 {

	public static void main(String[] args) {
		String reverse = "" ;
		Scanner word = new Scanner(System.in);
		 String Palin = word.nextLine();
		 int length = Palin.length();
		 
		 for ( int i = length - 1; i >= 0 ; i-- ) {
			 reverse = reverse + Palin.charAt(i);
		 }
		 if ( Palin.equals(reverse)) {
			 System.out.println( reverse +" is a palindrome word");
			 
		 }
		 else {
			 System.out.println( Palin +" is not a palindrome word");
			 
			 
		 }
		 
		
		

	}

}
