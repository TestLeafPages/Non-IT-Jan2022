package OOPs;

public class Student extends Person {
	
	public void workingProfessional() {
		System.out.println("I am a Tester");
	}

	public static void main(String[] args) {
		
		Student call=new Student();			
		call.personState();
		call.workingProfessional();
		
	}
	
	
	
	
	
}
