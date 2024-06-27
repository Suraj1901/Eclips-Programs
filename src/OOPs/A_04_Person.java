package OOPs;

public class A_04_Person {
	private String name;
	private int age;
	
	public A_04_Person() {
		// TODO Auto-generated constructor stub
	}
	
	public A_04_Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public A_04_Person(A_04_Person p) {
		this.age = p.age;
		this.name = p.name;
	}
	
	public void showData() {
		System.out.println(name+ " " +age);
	}
	
	public void showData(String name , int age) {
		System.out.println(name+ " " +age);
	}


}
