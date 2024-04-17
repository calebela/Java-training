package basics;
import java.util.*;
public class SalaryCalculator {
  public static void main(String[]args) {
	  
	  Scanner myObj = new Scanner(System.in);
	  String career;
	  System.out.println("enter");
	  career = myObj.nextLine();
	  System.out.println(career);
	 // System.out.println("program is starting");
	 // career = "software developer";
	//  System.out.println("my career "+ career);
	  
	  int hoursPerWeek= 40;
	  int weekPerYear= 50;
	  double rate = 42.5;
	  
	  double salary = hoursPerWeek * weekPerYear * rate;
	  System.out.println("my salary as a"+ career + "as the rate of "+ rate + "per hour is "+ salary +"per year");
	  
  }
}
