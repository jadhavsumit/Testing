import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sibling {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=eu");
		
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Hellowwww");

	}

}
