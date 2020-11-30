import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;


public class relLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		WebElement box = driver.findElement(By.cssSelector("[name='name']"));
		
		driver.findElement(withTagName("label.above(box)).getText()"));
		
		WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));

		driver.findElement(withTagName("input").below(dateofBirth)).sendKeys("02/02/1992");

		WebElement iceCreamLabel = driver
				.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));

		driver.findElement(withTagName("input").toLeftOf(iceCreamLabel)).click();

//Get me the label of first Radio button

		WebElement rb = driver.findElement(By.id("inlineRadio1"));

		System.out.println(driver.findElement(withTagName("label").toRightOf(rb)).getText());


	}

}
