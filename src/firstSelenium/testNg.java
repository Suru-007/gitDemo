package firstSelenium;

import org.testng.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNg {
	String Chromepath="C:\\Users\\hp\\Downloads\\chromedriver.exe";
	String URL="https://www.edureka.co/";
	WebDriver driver;
	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver",Chromepath);
		driver= new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void one() {
		
		String title=driver.getTitle();
		String ExpectedTitle="Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
		Assert.assertEquals(title, ExpectedTitle);
	}
	@AfterTest
    public void after() {
		driver.quit();
	}
	

}
