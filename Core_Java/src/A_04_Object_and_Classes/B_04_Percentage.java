package A_04_Object_and_Classes;

public class B_04_Percentage {
	private int id;
	private float per;
	
	public B_04_Percentage(int id,float per) {
		this.id=id;
		this.per= per;
	}
	
	public void percentage() {
		System.out.println(id+" = ");
		if(per > 90) {
			System.out.println("Execellent");
		} 
		else if (per > 80 && per < 90) {
			System.out.println("Very Good");
		}
		else if (per > 70 && per < 80 ) {
			System.out.println("Good");
		}
		else if (per > 60 && per < 70 ) {
			System.out.println("Average");
		}
		else if (per > 40 && per < 60) {
			System.out.println("Pass");
		}
		else if (per < 40) {
			System.out.println("Fail");
		}
	}

}
