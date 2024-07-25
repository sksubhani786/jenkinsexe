package WorkingWithTestNG;

import org.testng.annotations.Test;



public class Example_DependsOnMethods {
	
	
	@Test
	public void addaddress() {
		System.out.println("address added");
		
	}
	@Test(dependsOnMethods = "addaddress")
	public void modifyaddress() {
		System.out.println("address modified");
	}
	@Test(dependsOnMethods = "modifyaddress")
	public void deleteaddress() {
		System.out.println("address deleted");
	}
	
	
	
	
	
	
	
	

}
