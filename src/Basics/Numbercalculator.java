package Basics;

public class Numbercalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this program is starting dude !!");
		printname();
		int numa= 10;
		int numb = 20 ; 
		addtwonumber(numa,numb);
		int product = multiplynumber( numa , numb );
		System.out.println(" the product of " + numa + " & " + numb +  " is "+ product);
		
	}
static void printname() {
	System.out.println(" My name is Jayesh Raj .");
	
}
static int multiplynumber(int a , int b ) {
	int product = a *b ;
	addtwonumber( product +100 , product );
	return product ;
	
}
static  void  addtwonumber(int a , int b ) {
	
	int sum =  a +  b ; 
	
	System.out.println(" the sum of " + a  + " & " + b +  " is "+ sum ) ;

}
}
