package A_04_Object_and_Classes;

public class B_11_Person {
	private String name;
	B_09_Date b;
	
	public B_11_Person() {
		// TODO Auto-generated constructor stub
	}
	
	public B_11_Person(String name,int dd,int mm,int yy) {
		this.name = name;
		b = new B_09_Date(dd,mm,yy);
		
	}
	
	public void display() {
		System.out.println(name);
		b.showData();
	}
	
	}
	


