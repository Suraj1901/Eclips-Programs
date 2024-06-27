package OOPs;

public class A_03_Plants {
	private String plantName;
	private float price;
	
	public A_03_Plants(){
		
	}
	
	public A_03_Plants(String plantName,float price ){
		this.plantName = plantName;
		this.price = price;
		
	}
	
	public A_03_Plants(A_03_Plants p) {
		this.plantName = p.plantName;
		this.price = p.price;
	}
	
	public void showData() {
		System.out.println(plantName+ " " +price);
	}
	
	
	
	

}
