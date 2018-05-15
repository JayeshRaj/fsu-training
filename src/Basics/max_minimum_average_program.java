package Basics;

public class max_minimum_average_program {

	public static void main(String[] args) {
		int[] number = { -5 , 7 , 8 ,10 ,-100} ;
	System.out.println("maximum among the numbers are "  + max(number));
	System.out.println("minumum among the numbers are "  + min(number));
	System.out.println("average of the numbers are "  + average(number));
	}
	 public static int max(int[] arr) {
		 int max = arr[0];
		 for ( int i = 0 ;i < arr.length ; i ++ ) {
			 if ( arr[i] > max) {
				 max =  arr[i] ; 	 }
		 }return max; }	public static int min(int[] arr) {
			int min = arr[0] ;
			for ( int i = 0 ; i < arr.length ; i ++ ) {
				if ( arr[i]< min) {
					min = arr[i] ; 	}
}return min;	}
	 	public static int average( int [] arr ) {
int sum = 0 ;		for (int i = 0 ; i < arr.length ; i ++ ) {
sum = sum + arr[i] ; // arr[i] is used to add actual given number in the number array , not iterated i value 
			}return sum/arr.length;}}
