package OOP;

public class Loan implements IRate{

	@Override
	public void setRate() {
		System.out.println("rate");
	}

	@Override
	public void increaseRate() {
		System.out.println("increase");
		
	}

}
