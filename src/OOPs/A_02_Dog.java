package OOPs;

public class A_02_Dog {
	private String dogName;
	private String dogBreed;
	
	public A_02_Dog() {
		
	}
	
	public A_02_Dog(String dogName, String dogBreed) {
		this.dogBreed = dogBreed;
		this.dogName = dogName;
	}
	
	//Copy Constructor
	public A_02_Dog(A_02_Dog d) {
		this.dogBreed = d.dogBreed;
		this.dogName = d.dogName;
		
	}
	
	public void showData() {
		System.out.println(dogName+ " " +dogBreed);
	}

}
