package A_04_Object_and_Classes;

public class B_03_Calculate {
	private float no1;
	private float no2;
	
	public B_03_Calculate() {
		// TODO Auto-generated constructor stub
	}
	
	public B_03_Calculate(int no1,int no2) {
		this.no1 = no1;
		this.no2 = no2;
		
	}
	
	public void calculation() {
		System.out.println(no1+no2);
		System.out.println(no1-no2);
		System.out.println(no1*no2);
		System.out.println(no1/no2);


	}

}
