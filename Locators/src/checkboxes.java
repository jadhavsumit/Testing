import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class checkboxes {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		System.out.println(driver.findElement(By.cssSelector("input[id ='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id ='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id ='ctl00_mainContent_chk_friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id ='ctl00_mainContent_chk_friendsandfamily']")).isSelected()); 
		
		System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size()); 
		
	}
}