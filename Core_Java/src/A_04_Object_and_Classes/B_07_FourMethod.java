package A_04_Object_and_Classes;

public class B_07_FourMethod {
	private int a,b,c;
	private float f1,f2;
	private double d1;
	
	public void addition(int a,int b) {
		System.out.println(a+b);
	}
	public void addition(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void addition(float f1,float f2) {
		System.out.println(f1+f2);
	}
	public void addition(int a,float f1,double d1) {
		System.out.println(a+f1+d1);
	}
	

}
