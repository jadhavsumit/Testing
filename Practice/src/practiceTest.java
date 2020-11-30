import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input[id = 'checkBoxOption1']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[id = 'checkBoxOption1']")).isSelected());
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[id = 'checkBoxOption1']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[id = 'checkBoxOption1']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());
		

	}

}
