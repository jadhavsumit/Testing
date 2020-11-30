import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment13 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement input = driver.findElement(By.id("autocomplete"));
		
		input.click();
		
		input.sendKeys("Ind");
		
		Thread.sleep(2000);
		
		input.sendKeys(Keys.DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"autocomplete\").value";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		
		
		 while(!text.equalsIgnoreCase("India") ) {
		  
		 input.sendKeys(Keys.DOWN);
		 text = (String) js.executeScript(script);
		 input.sendKeys(Keys.ENTER);
		 System.out.println(text);
		 
		 Thread.sleep(2000); }
		 
		

	}

}
