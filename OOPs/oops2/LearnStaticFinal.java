package oops2;

public class LearnStaticFinal {

	static int x=20;
	static int y=10;
	final int r=10;
	int z=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LearnStaticFinal obj=new LearnStaticFinal();
		int z2 = obj.z;
		y=30;
		System.out.println(z2);
		System.out.println(obj.r);
		System.out.println(x+10);		
		System.out.println(y);
		
		
		
		
		
		
	}

}
