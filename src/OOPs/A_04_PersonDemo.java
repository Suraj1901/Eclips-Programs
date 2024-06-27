package OOPs;

public class A_04_PersonDemo {
	public static void main(String[] args) {
		A_04_Person p = new A_04_Person();
		p.showData("Suraj", 22);
		
		A_04_Person p1 = new A_04_Person("Suraj",22);
		p1.showData();
		
		A_04_Person p2 = new A_04_Person(p1);
		p2.showData();
		
		A_04_Person p3 = p2;
		p3.showData();
	}
}
