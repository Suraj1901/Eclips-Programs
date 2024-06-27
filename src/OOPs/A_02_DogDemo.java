package OOPs;

public class A_02_DogDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_02_Dog d = new A_02_Dog();
		d.showData();
		
		A_02_Dog d1 = new A_02_Dog("Alice","RoadWheeler");
		d1.showData();
		
		A_02_Dog d2 = new A_02_Dog(d1);
		d2.showData();
		
		A_02_Dog d3 = d1;
		d3.showData();
		
		if(d == d1) {
			System.out.println("Same");
		}else {
			System.out.println("Different");
		}
		
		if(d1 == d2) {
			System.out.println("Same");
		}else {
			System.out.println("Different");
		}
		
		if(d1 == d3) {
			System.out.println("Same");
		}else {
			System.out.println("Different");
		}

	}

}
