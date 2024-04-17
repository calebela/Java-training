package basics;

public class assignment {

	public static void main(String[] args) {
		//System.out.println(sum(10));
		//System.out.println(fact(5));
		int[] numbers = {1,2,3,4};
		System.out.println(findMin(numbers));
		System.out.println(findMax(numbers));
		System.out.println("average is "+ findAvg(numbers));
		
	}
	/*public static int sum(int n) {
		int sum1=0;
		for (int i=0;i<=n;i++) {
			sum1 = sum1 + i;
		}
		return sum1;
	}*/
	/*public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		else if (n ==1) {
			return 1;
		}
		return fact(n-1)*n;
	}*/

	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]< min) {
				min=arr[i];
			}
		}
		return min;
	}
	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]> max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static double findAvg(int[] arr) {
		double sum=0;
		double avg;
	for(int n=0;n<arr.length;n++) {
		sum = sum+arr[n];
	}
	System.out.println(sum);
	avg = sum/arr.length;
	return avg;
}
}