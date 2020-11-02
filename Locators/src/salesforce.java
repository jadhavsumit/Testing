import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		/*driver.findElement(By.id("username")).sendKeys("Hello");
		driver.findElement(By.name("pw")).sendKeys("password");
		driver.findElement(By.id("Login")).click(); */
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Hellow");
		driver.findElement(By.cssSelector("#password")).sendKeys("byebye");
		driver.findElement(By.id("Login")).click();
		
		
		
		

	}

}
