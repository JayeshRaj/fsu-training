package Basics;

public class Weather {
public static void main(String[] args) {
	int temp = 71;
	String SunCondition = "overcast";
	if( temp > 80) {
		System.out.println(" nice weather , smoke today and stay high");
	}
else if ((temp > 70 ) || (SunCondition == "overcast")) {
	System.out.println(" little bit colder , chill weather : smoke today and stay high high ");
}
else if  (( temp > 60 )||(SunCondition == "overcast")){
	System.out.println(" bit cold , chill weather : smoke today and stay high");
	
}
}
}



