package WorkingWithTestNG;

import org.testng.annotations.Test;

public class Example_MultipleTestAnnotations {
	
	
	@Test(priority = 1)
	public void register() {
		System.out.println("Register");
	}
	@Test(priority = 2)
	public void login() {
		System.out.println("Login");
	}
	@Test(enabled = false)
	public void addtocart() {
	System.out.println("Add To Cart");	
	}
	@Test(priority = 4)
	public void placeorder() {
		System.out.println("Place Order");
	}
	@Test(priority = 5)
	public void logout() {
		System.out.println("Logout");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
