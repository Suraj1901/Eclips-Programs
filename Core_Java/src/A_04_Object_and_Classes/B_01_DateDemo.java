package A_04_Object_and_Classes;

public class B_01_DateDemo {
	public static void main(String[] args) {
		B_01_Date b = new B_01_Date();
		b.showDate();
		
		B_01_Date b1 = new B_01_Date(13,6,2001);
		b1.showDate();
		
		B_01_Date b2 = b1;
		b2.showDate();
		
		
	}

}
