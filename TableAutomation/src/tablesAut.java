import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablesAut {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		int sum = 0;
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/31617/srh-vs-rcb-eliminator-indian-premier-league-2020");
		
		WebElement table = driver.findElement(By.cssSelector("div[class = 'cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		int rowcount = table.findElements(By.cssSelector("div[class = 'cb-col cb-col-100 cb-scrd-itms']")).size();
		
		int count = table.findElements(By.cssSelector("div[class = 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0;i<count-2;i++) {
			
			String value = table.findElements(By.cssSelector("div[class = 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueint = Integer.parseInt(value);
			sum = sum + valueint;
		}
		
		String extras = driver.findElement(By.xpath("//div[text() = 'Extras']/following-sibling::div")).getText();
		int valueint = Integer.parseInt(extras);
		int runsTotal = valueint + sum;
		System.out.println("Total of the runs is = " + runsTotal);
		
		String runs =  driver.findElement(By.xpath("//div[text() = 'Total']/following-sibling::div")).getText();
		int totalRunsScore = Integer.parseInt(runs);
		
		if(runsTotal == totalRunsScore) {
			System.out.println("Sum of the runs is equal to the final score");
			
		}else {
			System.out.println("Test Fails");
		}
		
	}

}
