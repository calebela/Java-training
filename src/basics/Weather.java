package basics;

public class Weather {
	public static void main(String[]args) {
		int temprature= 85;
		String sunCondition = "sunny";
		
		if ((temprature > 80)&& (sunCondition == "sunny")) {
			System.out.println("we could wear shorts");
			System.out.println("have a hat");
		}
		else if (temprature > 60) {
			System.out.println("wearlong sleaves");
		}
		else {
			System.out.println("its gonna be cold");
		}
	}

}
