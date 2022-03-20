package oops2;

import java.util.ArrayList;
import java.util.List;

public class Child extends Buyer3 implements Shape,Land{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Child num=new Child();
    Land buy=new Buyer();   
    
    
    int y2 = num.y;
		System.out.println(y2);
		System.out.println(Buyer3.x);
		System.out.println(Buyer3.squarFt);
		
		Child num2=new Child();
		
		
	}

	public void circle() {
	System.out.println("To draw sun");
		
	}
	public void rectangle() {
System.out.println("home");		
	}

	public void square() {
System.out.println("Window");		
	}

	public void triangle() {
		// TODO Auto-generated method stub
		System.out.println("roof");
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
