package caleb;

public class Main {
	int x=50 ;
	String fname = "caleb";
	
	static void myMethod() {
		System.out.println("hello");
	}
	public void myMethods(String fname) {
		System.out.println("hey "+ fname);
	}
	private String name;
	public String get() {
		return name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	
}
