package OOP;

public class Main {
	/*int speed;
	 
	public Main (int num) {
		speed = num;
	}
	*/
	public void fullThrottle() {
		System.out.println("The car is at maximum speed");
	}
	public void speed(int speed) {
		System.out.println("MAX SPEED IS: "+ speed);
	}

	public static void main(String[] args) {
		Main myCar = new Main();
		myCar.fullThrottle();
	//	System.out.println("MAX SPEED IS: "+ myCar.speed);
		myCar.speed(120);
		

	}

}
