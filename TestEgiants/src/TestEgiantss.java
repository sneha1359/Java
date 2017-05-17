import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestEgiantss {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.gecko.driver", "I:/geckodriver.exe");

	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.theegiants.com");
		WebElement link;
		link=driver.findElement(By.linkText("Careers"));
		link.click();
		Thread.sleep(5000);
		driver.quit();
}
}
