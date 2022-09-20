package firstSelenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumindepth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		int j=0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		String[] names = {"Beans","Cucumber","Carrot"};
		List<WebElement> option= driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		List<String> arraylist= Arrays.asList(names);
		for(int i=0;i<option.size();i++) {
			
			String[] arr=option.get(i).getText().split("-");
			String OriginalName=arr[0].trim();
			if(arraylist.contains(OriginalName)) {
				j++;
				driver.findElements(By.xpath("//*[@class='product-action']/button")).get(i).click();
				
			System.out.println(j);
			
				
			}
			
		}
		
		
		
	
			
		
		driver.close();

	}

	private static List<String> ArrayToListConversion(String[] names) {
		// TODO Auto-generated method stub
		return null;
	}
}


