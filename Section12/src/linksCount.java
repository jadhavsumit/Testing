import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksCount {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); // limit web driver scope
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement coldriver = footerdriver.findElement(By.xpath("//tbody/tr[1]/td[1]"));
		
		System.out.println(coldriver.findElements(By.tagName("a")).size());
		
		for(int i = 1;i<coldriver.findElements(By.tagName("a")).size();i++){
			
			String clickOnTabs = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			coldriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnTabs);
			Thread.sleep(5000);
		} // opens all the tabs
		
		
			Set<String> abs = driver.getWindowHandles();
			Iterator <String> it = abs.iterator();
		
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
		}
	}


