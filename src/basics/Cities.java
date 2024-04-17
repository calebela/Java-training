package basics;

public class Cities {

	public static void main(String[] args) {
		String[] cities = {"New york","San francisco","miami","dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		String[] states = new String[5];
		states[0]= "cali";
		states[1]= "ohio";
		states[2]= "new jersy";
		states[3]= "texas";
		states[4]= "utah";
		//System.out.println(states[0]);
		System.out.println("******************");
		
		 String[] countries;
		 countries = new String[3];
		 countries[0]="usa";
		 countries[1]="canada";
		 countries[2]="uk";
		 // do while loop
		 int i= 0;
		 do {
		 System.out.println(countries[i]);
		 i++;
		 } while(i <3);
		 //while loop
		 int n = 0;
		 boolean stateFound = false;
		 while(n <= 4) {
			 String state = states[n];
			 if (state == "ohio")  {
				 System.out.println("sate found");
			 stateFound = true;
			 }
			 n++;
		 }
		 // For loop
		 for (int x=0;x <5;x++) {
			 System.out.println(states[x]);
		 }
		 

	}
}