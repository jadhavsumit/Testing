import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://fb.com");
		driver.findElement(By.id("email")).sendKeys("smtjdhv5@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sumit@1990");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		
		

	}

}
