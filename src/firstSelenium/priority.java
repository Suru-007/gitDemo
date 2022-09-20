package firstSelenium;

import org.testng.annotations.Test;

public class priority {
    @Test(priority=3)
	public void first() {
		System.out.println("This is the first class");
	}
	@Test(priority=1)
	public void second() {
		System.out.println("This is the second class");
	}
	@Test(priority=2)
	public void third() {
		System.out.println("This is the third class ");
	}
}
