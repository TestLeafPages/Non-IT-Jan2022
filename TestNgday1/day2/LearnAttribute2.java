package week6.day1;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LearnAttribute2 {

	@Test(dependsOnMethods= "aloginPage",alwaysRun=true)
	public void createLead() {
		System.out.println("Created Successfully");
		
	}
	@Test
	public void aloginPage() {
		System.out.println("Logged in successfully");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods= {"aloginPage","createLead"})
	public void editLead() {
		System.out.println("Updated the lead");
	}	
	
	@Test(invocationCount=4,timeOut=3000)
	public void deleteLead() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Delete lead");
	}
	
}
