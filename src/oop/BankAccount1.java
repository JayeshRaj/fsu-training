package oop;

public class BankAccount1 {
	String AccountNumber ; 

	String RoutingNumber ; 
	String ssn; 
	private String name ; 
	String AccountType ;
	double balance = 0  ; 
	
	


// creating constructor 
/*BankAccount1(){
	System.out.println("New Account is Created ");
	
}

BankAccount1( String name , String AccountType , int initialdeposit){
	System.out.println(" Type of Account  Mr. Jayesh Raj has is " + AccountType +" with the" + " initialdeposit = " + initialdeposit);
	String Msg = null ; 
	if ( initialdeposit < 1000) {
		 Msg = " please ensure that intialdeposit is > $ 1000 " ; 
		
	} else {
		 Msg = "Thank you for ur deposit"; 
		}
	System.out.println(Msg);
	balance = balance + initialdeposit ; }*/
	

 void checkbalance(){
	System.out.println( " balance = " + balance);
	
}
 public void setName(String name) {
	 this.name= "Mr." + name;	 
 }
 public String getName() {
	 return name ; 
 }

 public String toString() {
	return "["+ name + "." + AccountNumber + ". balance : $ " + balance + ". ]";
}
 void deposit( double amount) {
	 balance = balance + amount ; 
	 showactivity(" deposit ") ; 
	 
	 
 }
 void withdraw( double amount ) {
	 balance = balance - amount ; 
	 showactivity("withdraw") ;
	 
 }
 private void showactivity( String activity) {
	 System.out.println(" your recent activity is " +  activity );
	 System.out.println(" your current balance is " +  balance);
	 
 }}
 // encapsulation technique 
 

