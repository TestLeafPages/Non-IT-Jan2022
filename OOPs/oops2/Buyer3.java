package oops2;

public class Buyer3 extends Apartment implements Land{
	static int x=10;
	final int z=19;
	int y=15;
	public void conPark() {
		System.out.println("Park to common people");
	}	
	
	public void commercialPurpose() {
	
		System.out.println("Shopping complex");
	}

	public void builder() {
		System.out.println("Appartment" +x);
	}

	public void person() {
	
	
		
		System.out.println("Individual house" +x);
	}
	

	public static void main(String[] args) {
		Buyer3 buy=new Buyer3();
		System.out.println(x);
		buy.builder();
		buy.commercialPurpose();
		buy.conPark();
		buy.person();
		
	}

	@Override
	public void serviceArea() {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
