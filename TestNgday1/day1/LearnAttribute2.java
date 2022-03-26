package week6.day1;

import org.testng.annotations.Test;

public class LearnAttribute2 {

	@Test(dependsOnMethods= "aloginPage")
	public void createLead() {
		System.out.println("Created Successfully");
		
	}
	@Test
	public void aloginPage() {
		System.out.println("Logged in successfully");
		
	}
	@Test(dependsOnMethods= {"aloginPage","createLead"})
	public void editLead() {
		System.out.println("Updated the lead");
	}
	
	
}
