package Basics;

public class cities {

	public static void main(String[] args) {
		String[] cities = new String[3] ;
		cities[0]= " New york " ;
		cities[1] = " patna ";
		cities[2] = " Tallahassee" ;
		/*int i = 0 ;
		do { 
			System.out.println(cities[i]);
			i = i +1 ;
			
			
		}
		while (i <3);
		*/
		
		int n = 0 ; 
		boolean Citiesfound = false ; 
		while (!Citiesfound) {
			String city = cities[n] ;
			System.out.println(city);
			if ( city == " patna ") {
				System.out.println(" Out Of United State city found here ! attention required "); 
				Citiesfound = true ;	
				}
			n++;
}}}
