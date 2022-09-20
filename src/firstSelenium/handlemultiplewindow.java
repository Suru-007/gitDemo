package firstSelenium;

import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handlemultiplewindow {
      @Test
	public  void min() throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
	    
		driver.findElement(By.xpath("(//span[text()='Start my free trial'])[1]")).click();
		Set<String> window=driver.getWindowHandles();
		java.util.Iterator<String> iterate=  window.iterator();
		 String parent=iterate.next();
		 System.out.println(parent);
		 String child=iterate.next();
		 System.out.println(child);
		 driver.switchTo().window(parent);
		 Thread.sleep(4000);
		 driver.findElement(By.id("UserFirstName-kShj")).sendKeys("123");
		 driver.findElement(By.id("UserLastName-jfF0")).sendKeys("123#");
		 driver.switchTo().window(parent);
		 File screenshot= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshot, new File("C:\\Users\\hp\\Downloads\\screenshot\\12.jpf"));
		 driver.quit();
		
		
	}
		

}
