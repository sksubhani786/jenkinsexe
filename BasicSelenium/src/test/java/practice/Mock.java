package practice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Mock {
	@BeforeTest
	public void Beforesuite() {
		System.out.println("establish connect to server");
	}

}
