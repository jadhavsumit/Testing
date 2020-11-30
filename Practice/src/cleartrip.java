import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class cleartrip {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.id("RoundTrip")).click();
		
		driver.findElement(By.id("DepartDate")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[5]/a[1]")).click();
		
		Select s= new Select(driver.findElement(By.id("Adults")));
		
		s.selectByValue("4");
		
		Select v= new Select(driver.findElement(By.id("Childrens")));
		
		v.selectByValue("4");
		
		Select z= new Select(driver.findElement(By.id("Infants")));
		
		z.selectByValue("4");
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		
		Thread.sleep(4000);
		
		Select u= new Select(driver.findElement(By.id("Class")));
		
		u.selectByValue("First");
		
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("AirIndia");
		
		driver.findElement(By.id("creditShell")).click();
		
		driver.findElement(By.id("SearchBtn")).click();
		
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
		
		
		
		
		

	}

}
