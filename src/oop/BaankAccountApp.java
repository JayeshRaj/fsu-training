package oop;

public class BaankAccountApp {
	  public static void main(String[] args) {
		BankAccount ac1 = new BankAccount();  // same constructor of program with class = BankAccount :) 
		ac1.setName("JAYESH RAJ");
		System.out.println(ac1.getName());
		ac1.setSSN("478644962");
		System.out.println(ac1.getSSN());
		ac1.setRate();
		ac1.increaseRate();
		ac1.balance = 56 ; 
		ac1.Deposit(4000);
		ac1.Deposit(1000);
		ac1.Withdraw(4000);
		ac1.toString();
		ac1.CheckBalance();
		
		
		/*BankAccount ac2 = new BankAccount( "checking account",1000.01 );
		ac2.toString();
		ac2.CheckBalance();
		
		System.out.println(ac2.toString());
		// same constructor of program with class = BankAccount :) 
		
}/ */
}
}

																																																																																																																																																																																																																																																	