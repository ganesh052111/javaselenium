import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Branches\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement srcbx =  driver.findElement(By.id("twotabsearchtextbox"));
		
		srcbx.sendKeys("iphone 14");
		
		WebElement icn = driver.findElement(By.xpath("//input[@type='submit']"));
		
		icn.click();
		
		Actions a = new Actions(driver);
		
		
	}
}
