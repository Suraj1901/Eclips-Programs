package A_04_Object_and_Classes;

public class B_01_Date {
	private int dd;
	private int mm;
	private int yy;
	
	public B_01_Date() {
		// TODO Auto-generated constructor stub
	}
	
	public B_01_Date(int dd,int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void showDate() {
		System.out.println(dd+" "+mm+" "+yy);
	}

}
