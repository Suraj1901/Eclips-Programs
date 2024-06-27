package A_04_Object_and_Classes;

public class B_02_Box {
	private int l;
	private int w;
	private int h;
	
	public B_02_Box() {
		// TODO Auto-generated constructor stub
	}
	
	public B_02_Box(int length, int width , int height) {
		l = length;
		w = width;
		h = height;
	}
	
	public void volume() {
		int v = l * w * h;
		System.out.println(v);
		
		
	}
}
