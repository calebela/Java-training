package OOP;

public class BankAccount implements IRate{
	//Define status
	String accountNumber;
	
	// static - belongs to the class not the object
	// final - constant
	 private static final String routingNumber= "123123";
	
	//Instance variables
	private String name;
	private String ssn;
	private String accountType;
	double balance = 0;
	
	//constructor definitions: unique methods
	  //1. used to define define,setup,initialize properties of an object
	  //2. constructors are called up on instantiation
	  // 3. the same name as the class itself
	  // 4. constructors have no return type 
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	// over loading: call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("new account:" + accountType);
	
	}
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accountType, Msg are all local variables
		System.out.println("new account: " + accountType );
		System.out.println("initial deposit of :$" + initDeposit);
		String Msg = " ";
		if (initDeposit < 1000) {
			 Msg = "Error: minimum deposit is $1000";
			}
		else {
			 Msg = "thanks for your initial deposit of: "+ initDeposit;		
			}
		System.out.println(Msg);
		balance = balance + initDeposit;
	}
	
	
	// Interface methods
	public void setRate() {
		System.out.println("Setting Rate");
	}
	public void increaseRate() {
		System.out.println ("Increasing Rate");
	}
	
	
	
	
	// Getters / Setters
	
	//Allow the user to define the name
	public void setName(String name) {
		this.name = "Mr." + name;
	}
 	public String getName() {
 		return name;
 	}
 	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn ="SSN: " + ssn;
	}
	
 	
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	//define methods
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	void withdraw(double amount) {
		balance = balance - amount ;
		showActivity("WITHDRAW");
	}
	
	// Private : can only be called from with in the class
	private void showActivity(String activity) {
		
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $ " + balance);
	}
	
	void checkBalance() {
		System.out.println("balance is:" + balance);
	}
	void getStatus() {
		
	}
	@Override
	public String toString() {
		return "[ NAME:" + name +" . ACCOUNT# " +accountNumber + " ROUTING #"+routingNumber +" . BALANCE: $" + balance + " ]";
	} 

}
