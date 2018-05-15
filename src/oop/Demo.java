
package oop;
class person {
	String name ; 
	String emailid;
	String phonenumber ; 
	void walk() {
		System.out.println( name + " is walking " ) ; 
		
	}
	void email() {
		System.out.println( emailid ) ;
	}
	void activity() {
		System.out.println( name + " is sleeping " ) ;

	}
	void phonenumber() {
		System.out.println( name +  " cell number is  " + phonenumber ) ;
	}
	
}

public class Demo {

	public static void main(String[] args) {
	
		// instatiating an object 
person person1 =new person() ;
// giving properties to object 
person1.name = " Jayesh";
person1.emailid = " jr16af@my.fsu.edu";
person1.phonenumber = " 8083302302";

// abstraction 
person1.walk();
person1.email();
person1.activity();
person1.phonenumber();



	}

}
