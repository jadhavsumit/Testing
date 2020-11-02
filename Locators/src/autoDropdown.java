
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class autoDropdown {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("In");
		
		Thread.sleep(3000);
		
		List<WebElement> options = driver.findElements(By.cssSelector("ul[id='ui-id-1']>li"));
		
		for (WebElement option :options) 
		{
			
			if(option.getText().equalsIgnoreCase("India"))
					{
						option.click();
						break;
					}
		}
		
		
		
		
		
		
		
		

	}

}
