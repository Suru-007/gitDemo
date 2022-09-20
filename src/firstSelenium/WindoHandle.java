package firstSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.xpath("//*[text()='Free Access to InterviewQues/ResumeAssistance/Material']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String parent=it.next();
		String child= it.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//*[@class='im-para red']")).getText());
		String email= driver.findElement(By.xpath("//*[@class='im-para red']")).getText().split("mentor")[1].split("with")[0].trim();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(email);

}

}
