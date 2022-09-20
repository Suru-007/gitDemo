package firstSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
	String Chromepath="C:\\Users\\hp\\Downloads\\chromedriver.exe";
	String URL="https://www.edureka.co/";
	WebDriver driver;
	
	@Test
	public void one() {
		System.setProperty("webdriver.chrome.driver",Chromepath);
		driver= new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		String ExpectedTile="Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
		Assert.assertEquals("Title", "xpectedTitle");
driver.quit();
	}

}
