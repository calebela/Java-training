package basics;

public class NumbersCalc {
	public static void main(String[]args) {
		System.out.println("starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA,numB);
		System.out.println( multiplyNumbers(numA,numB));
	}
	static void printName() {
		System.out.println("my name is caleb");
	}
	static void addNumbers(int numberA,int numberB) {
		int sum = numberA + numberB;
		System.out.println(sum);
	}
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		addNumbers(product,product);
		return product;
		

	}

}
