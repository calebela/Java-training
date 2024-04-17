package OOP;
//Encapsulation
public class Encap {
	
	private String name;
	public void setName(String caleb) {
		this.name = caleb;
	}
	public String getNmae() {
		return name;
	}
	
	public static void main(String[]args) {
		Encap myObj = new Encap();
		myObj.setName("caleb");
		System.out.println(myObj.getNmae());
	}

}
