package OOPs;

public class A_01_Books {
	private String title;
	private String author;
	
	public A_01_Books(){
		
	}
	public A_01_Books(String title,String author){
		this.title = title;
		this.author = author;		
	}
	public void showData() {
		System.out.println(title+ " " +author);
		
	}
	

}


