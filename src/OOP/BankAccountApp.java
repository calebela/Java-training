package OOP;

public class BankAccountApp {

	public static void main(String[] args) {
		//Creating a new bank account
		// create a new object called acc1
		
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "caleb belete";
		
		
		//with encapsulation : PUBLIC API METHOD
		
		acc1.setName("CALEB BELETE");
		System.out.println(acc1.getName());
		acc1.setSsn("9968698");
		System.out.println(acc1.getSsn());
		acc1.setAccountType("CHECKING ACCOUNT");
		System.out.println( acc1.getAccountType());
		
		acc1.accountNumber = "456876543";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		System.out.println(acc1.toString());
		
		
		/*
		BankAccount acc2 = new BankAccount("Checking Account");
		System.out.println(acc2.toString());
		
		BankAccount acc3 = new BankAccount("Savings Account" ,40000);
		
		acc3.checkBalance();
		
		//System.out.println(acc1.routingNumber);
		//System.out.println(acc2.routingNumber);
		//System.out.println(acc3.routingNumber);
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.accountNumber = "56485659";
		cd1.interestRate ="4.5";
		cd1.balance = 3000;
		cd1.name = "caleb";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		*/
	}

}
