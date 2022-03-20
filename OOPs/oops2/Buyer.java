package oops2;

public class Buyer extends Apartment {

	public static void main(String[] args) {
		Buyer buys=new Buyer();
		buys.kitchen();
		buys.serviceArea();
		}
	@Override
	public void serviceArea() {
		System.out.println("store room");		
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
