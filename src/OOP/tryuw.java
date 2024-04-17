package OOP;

public class tryuw {


	static void myMethod(String fname,int age) {
		System.out.println("i love you "+ fname + " is "+ age );
	}
	 static int myMethod(int x,int y) {
		int sum;
		sum = x+y;
		System.out.println(sum);
		return sum;
		
	}
	static void checkAge(int age) {
		if (age<18) {
			System.out.println("not old enough to vote");
		}
		else {
			System.out.println("old enough");
		}
	}
	static double myMethod(double x,double y) {
		double sum = x + y;
		System.out.println(sum);
		return sum;
	}
	 static int sum(int k) {
		if (k>0) {
			int result = k + sum(k-1);
		//	System.out.println(result);
			return result;
		}
		else {
			return 0;
		}
	}
	public static int sum(int start,int end) {
		if(end > start) {
			return end +sum(start,end-1);
		}
		else {
			return start;
		}
	}

	public static void main(String[] args) {
		myMethod("kal",12);
		myMethod(12,13);
		myMethod(12.3,12.0);
		checkAge(15 );
		System.out.println("************");
		int result =sum(5);
		System.out.println(result);
		
	}
}

