package OOPs;

public class FamilyMember extends Character {

	public void father() {
		System.out.println("I am a father");
	}	
	public void attitude(int v) {
		super.attitude(7);
		System.out.println("I became More responsible");
	}
	
	public static void main(String[] args) {
		FamilyMember mem=new FamilyMember();
		mem.father();
	    mem.attitude(6);
		
	}

}
