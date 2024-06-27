package OOPs;

public class A_05_Accounts {
	private int accno;
	private String name;
	
	public A_05_Accounts() {
		// TODO Auto-generated constructor stub
	}
	
	public A_05_Accounts(int accno, String name) {
		this.accno = accno;
		this.name = name;
		
	}
	
	public void showData() {
		System.out.println(name+ " "+accno );
	}
	
	public void showData(String name,int accno) {
		System.out.println(name+ " "+accno );
	}

}
