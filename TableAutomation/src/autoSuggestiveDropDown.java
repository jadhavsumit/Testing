import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//WebDriverWait w = new WebDriverWait(driver,10);
		
		driver.get("https://ksrtc.in/oprs-web/");
		
		WebElement inp = driver.findElement(By.id("fromPlaceName"));
		
		inp.click();
		
		inp.sendKeys("BEN");
		
		inp.sendKeys(Keys.DOWN);
		
		inp.sendKeys(Keys.ENTER);
		
		WebElement toinp = driver.findElement(By.id("toPlaceName"));
		
		toinp.sendKeys("MUM");
		
		Thread.sleep(2000);
		
		toinp.sendKeys(Keys.ENTER);
	
		// Extracting elements with js 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"fromPlaceName\").value";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		
		//finding an element with while loop
		
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
			
			inp.sendKeys(Keys.DOWN);
			
			text = (String) js.executeScript(script);
			System.out.println(text);
		}
		
		

	}

}
