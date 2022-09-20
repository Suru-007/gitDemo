package firstSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	public static void main(String...args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		String checkbox="//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-15d164r r-1otgn73']/div[@style='margin-right: 6px;']/*";
		System.out.println(driver.findElement(By.xpath(checkbox)).isSelected());
		driver.findElement(By.xpath(checkbox)).click();
		System.out.println(driver.findElement(By.xpath(checkbox)).isSelected());
		System.out.println(driver.findElements(By.xpath(checkbox)).size());
		File screenShot= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File("C:\\Users\\hp\\Downloads\\screenshot\\screen.png"));
		driver.close();
		
	}

}
