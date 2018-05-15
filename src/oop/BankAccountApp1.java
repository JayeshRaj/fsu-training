package oop;

public class BankAccountApp1 {

	public static void main(String[] args) {
		// Creating object Now 
		BankAccount1 acc1 = new BankAccount1();
		/*BankAccount1 acc2 = new BankAccount1("Jayesh Raj");
		BankAccount1 acc3 = new BankAccount1("Jayesh Raj ","checking account", 4467);
		acc3.checkbalance();
		acc3.AccountNumber = "68688";
	*/
		System.out.println(acc1.toString());
		acc1.deposit(4000);
		acc1.withdraw(8000);
	
		
		acc1.AccountNumber = "68688";
		acc1.setName("Jayesh Raj");
		System.out.println(acc1.getName());
		
		System.out.println(acc1.toString());
		acc1.withdraw(2000); // credit card loan 
		
		acc1.deposit(49);
		acc1.deposit(2888);
		
		
		
	
		
	}

}
