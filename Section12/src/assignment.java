import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		WebElement check = driver.findElement(By.xpath("//div[@id='checkbox-example']//label[1]"));
		
		String optioncheck = check.getText();
		
		System.out.println(optioncheck);
		
		Thread.sleep(5000);
		
		WebElement dDown = driver.findElement(By.id("dropdown-class-example"));
		
		Select s = new Select(dDown);
		
		s.selectByVisibleText(optioncheck);
		
		WebElement textEnter = driver.findElement(By.id("name"));
		
		textEnter.sendKeys(optioncheck);
		
		driver.findElement(By.id("alertbtn")).click();
		
		

	}

}
