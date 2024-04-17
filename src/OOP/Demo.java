package OOP;
class person{
	String name;
	int phone;
	String email;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	void eat() {
		System.out.println(email);
	}
	void sleep() {
		System.out.println(name + " is eating");
	}
}

public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		//define some properties or
		person person1 = new person();
		person1.name = "caleb";
		person1.email = "caleb@gmail";
		person1.phone = 1235463;
		
	
		// Abstraction; like calling
		person1.walk();
		person1.sleep();
		person1.eat();
		
		person person2 = new person();
		person2.name = "belete";
		person2.email = "belete@gmail";
		person2.phone = 8796568;
		
		person2.walk();
		
		
		// person attributes
		/*String name = "caleb";
		String email = "caleb@gmail.com";
		String phone = "78975487987";
		
		System.out.println(name + " is eating");
		System.out.println(phone + " number");
		
		String name1 = "belete";
		String email1 = "belete@gmail.com";
		String phone1 = "1234631561";
		
		System.out.println(name1 + " is eating");
		System.out.println(phone1 + " number");
		*/
	}

}
