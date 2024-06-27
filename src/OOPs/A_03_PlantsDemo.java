package OOPs;

public class A_03_PlantsDemo
{
	public static void main(String[] args)
	{
		A_03_Plants p = new A_03_Plants();
		p.showData();
		
		A_03_Plants p1 = new A_03_Plants("Apple",50.00f);
		p1.showData();
		
		A_03_Plants p2 = new A_03_Plants(p1);
		p2.showData();
		
		A_03_Plants p3 = p2;
		p3.showData();
		
		
	
	
	}

}
