package oops2;

public class Community extends Apartment {
	public void homeTeatre() {
		System.out.println("Community property");
	}
		
	public static void main(String[] args) {
		Community call =new Community();
		call.kitchen();
		call.serviceArea();
		call.homeTeatre();	
		
	}

	@Override
	public void serviceArea() {
		System.out.println("Common Area");
		
	}

	public void commercialPurpose() {
		// TODO Auto-generated method stub
		
	}

	public void builder() {
		// TODO Auto-generated method stub
		
	}

	public void person() {
		// TODO Auto-generated method stub
		
	}

}
