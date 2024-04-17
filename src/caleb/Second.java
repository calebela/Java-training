package caleb;

public class Second {
	static int x =10;
	
	public static void main(String[]args) {
		Main myObj = new Main();
		System.out.println("Name is : "+ myObj.fname + " is " + myObj.x);
		myObj.myMethods("caleb");
		Main.myMethod();
		myObj.setName("kaleab");
		System.out.println(myObj.get());
		}
	
}
