package week6.day1;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	@Test(priority=3,invocationCount=5, threadPoolSize=3)
	public void driverCar() {
		System.out.println("Wish to drive a car");
	}
	
	@Test(priority=1,dependsOnMethods="Week6.day1.LearnAttribute2.aloginPage")
	public void awningaCar() {
		System.out.println("I own a Audi car");
	}
	@Test(priority=2)
	public void eowningLiscence() {
		System.out.println("I have liscence");
	}
	
	@Test(priority=-4,enabled=false)
	public void startMusicSystem()
	
	{
		System.out.println("Switch on the music system");
		
	}
	

}
