package firstSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class moreonAssertion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	System.out.println(driver.findElement(By.xpath("//fieldset//input[@type='checkbox']")).isSelected());
	List<WebElement> checkbox= driver.findElements(By.xpath("//fieldset//input[@type='checkbox']"));
	System.out.println(checkbox.size());
	
	
	for(WebElement sle: checkbox) {
		
		sle.click();
		System.out.println(sle.isSelected());
		sle.click();
		System.out.println(sle.isSelected());
	}
	
	
	driver.quit();
	
	}
}
	
