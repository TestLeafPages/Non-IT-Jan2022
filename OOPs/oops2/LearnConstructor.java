package oops2;

public class LearnConstructor {
	int x = 5;
	String college;

	LearnConstructor() {

		System.out.println("I am a constructor");
	}

	LearnConstructor(String Name) {
		int y = 10;
		System.out.println("My name is : " + Name + y);
	}

	LearnConstructor(String college, int x) {
		this.college = college;
		System.out.println("My name is : " + college + ":" + x);
	}

	public void method() {
		System.out.println("Normal Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnConstructor obj = new LearnConstructor();
		LearnConstructor obj1 = new LearnConstructor("Loyola", 3);
		int x2 = obj.x;
		System.out.println(x2);
		obj.method();
	}

}
