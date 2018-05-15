package oop;

public class BankAccount implements IRate {
String accounttype;
final String routingnumber = "132323";
int accountnumber ;
double  balance ;
 String name ;
private String SSN ; 



	
BankAccount(){
		System.out.println("Account Created  ") ;
	}

	
	
BankAccount( String accounttype , double intdeposit){
	System.out.println("Nature of account is " +accounttype);
	System.out.println("Intially deposited amount : " +intdeposit);
	String Msg ;
	if ( intdeposit< 1000) {
	Msg = "please maintain minimum of 1000 dollars";
	}
	else {
	Msg= "thankyou for your initial deposit which is :  "  +intdeposit;
	}	
	System.out.println(Msg);
	balance = intdeposit ; 
	
}


	
	public String getName() {
	return name;
}



public void setName(String name) {
	this.name = "Mr."+name;
}



	
	




public void setSSN(String sSN) {
	SSN = sSN;
}
public String getSSN() {
	return SSN;
}



public void setRate() {
	System.out.println(" setting rate = 12.5 PQ %  ");
}
public void increaseRate() {
	System.out.println(" Increasing rate = 0.2 % ");
	
}

	void Deposit(int amount) {
		balance = balance + amount ; 
		ShowActivity("DEPOSIT");
		
		
	}
	void Withdraw(int amount) {
		balance = balance - amount;
		ShowActivity("WITHDRAWN");
		
		
	}
	 private void ShowActivity(String activity) {
		System.out.println("showing recent transaction " + activity);
		System.out.println("your new balance is  " + balance);
		
	}
	 

	public void CheckBalance() {
		System.out.println("Balance is : " +balance);
			
	}
	void getstatus() {
		 
	 }
	

public String toString() {
	return "xyx" +balance + "." + " your initial deposit  " +balance  + " > 1000 usd minimun "  ;
	
	
	
}
}




