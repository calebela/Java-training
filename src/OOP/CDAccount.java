package OOP;

public class CDAccount extends BankAccount implements IRate{
	
	String interestRate;
	
	void compount() {
		System.out.println("Compounding interst");
	}

}
