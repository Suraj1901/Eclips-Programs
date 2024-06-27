package A_04_Object_and_Classes;

public class B_06_Complex {
	private int img , real;
	
	public B_06_Complex(int a,int b) {
		img = a;
		real = b;
	}
	
	public void showdata() {
		System.out.println(img+"+"+real+"i");
	}


}
