package firstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class assingment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Sourabh");
        driver.findElement(By.xpath("(//input[@name='email'])")).sendKeys("Sourabh@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("Ram12@");
        driver.findElement(By.id("exampleCheck1")).click();
        WebElement drop= driver.findElement(By.id("exampleFormControlSelect1"));
        Select select= new Select(drop);
        select.selectByVisibleText("Female");
        driver.findElement(By.id("inlineRadio2")).click();
        driver.findElement(By.xpath("//input[@name='bday']")).click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String text=driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
        System.out.println(text);
        driver.close();
        
        
	}

}
