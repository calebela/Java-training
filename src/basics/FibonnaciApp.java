package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		System.out.println(fib(2));
		for (int i=2;i<=10;i++) {
			System.out.println(fib(i));
		}
	}
	public static int fib(int n) {
		if (n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		
		return ((fib(n-1)+ fib(n-2)));
	}

}
