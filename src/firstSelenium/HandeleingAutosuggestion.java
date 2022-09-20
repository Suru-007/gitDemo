package firstSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandeleingAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("IND");
		Thread.sleep(2000);
		List<WebElement> li=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option : li) {
			System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("India")){
			//Thread.sleep(2000);
			option.click();
			break;
			}
			
		}

		driver.quit();
	}

}
