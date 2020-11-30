import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table = driver.findElement(By.id("product"));
		
		int rowsnum = table.findElements(By.tagName("tr")).size();
		
		int header = table.findElements(By.tagName("th")).size();
		
		int colsnum = table.findElements(By.tagName("td")).size();
		
		System.out.println("total rows are = " + rowsnum);
		
		System.out.println("total colomns are = " + header);
		
		System.out.println(table.findElement(By.xpath("//tbody/tr[3]")).getText());
		
		
	}

}
