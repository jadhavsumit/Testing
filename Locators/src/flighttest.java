
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class flighttest {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Amritsar (ATQ)')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Chennai (MAA)')])[2]")).click();
		
		
		
		
		
		
		

	}

}
