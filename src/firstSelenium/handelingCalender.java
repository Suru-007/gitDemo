package firstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class handelingCalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Pandit Deen Dayal Upadhyay Airport']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Belagavi']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-156aje7.r-y47klf.r-1phboty.r-1d6rzhh.r-1pi2tsx.r-1777fci.r-13qz1uu")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[text()='Select Date']")).getAttribute("style"));
		System.out.println(driver.findElement(By.xpath("//div[text()='Select Date']")).isEnabled());
		
		if( driver.findElement(By.xpath("//div[text()='Select Date']")).getAttribute("style").contains("font-family: inherit; opacity: 0.5;"));
		{
			System.out.println("Button is disabled");
		
			
		}
		driver.quit();
		

	}

}
