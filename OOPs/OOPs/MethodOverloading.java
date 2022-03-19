package OOPs;

public class MethodOverloading {

	
	public void studentInfo(String name, int rollno) {
		
		System.out.println(name +""+rollno);
	}
	
	public void studentInfo(String collName, String Location) {
		System.out.println(collName + " "+Location );
		
	}
	
	public void studentInfo(long phno) {
		System.out.println(phno);
	}
	public void studentInfo() {
		System.out.println("Example of Method Overloading");
	}
	
	
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.studentInfo();
		obj.studentInfo(9345435243l);
		obj.studentInfo("Sanjay", 12);
		obj.studentInfo("Loyola", " Chennai");
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
