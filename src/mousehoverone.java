import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehoverone {
	

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amitm\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://practice.testingclub.in/");
		driver.findElement(By.name("email")).sendKeys("amitmeta122@gmail.com");
		driver.findElement(By.id("sign-in")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Mouse Actions")).click();
		driver.findElement(By.partialLinkText("Hover")).click();
		driver.findElement(By.linkText("Simple Menu")).click();
		Actions actions = new Actions(driver);
		WebElement button = driver.findElement(By.cssSelector(".dropbtn"));
		actions.moveToElement(button).perform();
		WebElement link = driver.findElement(By.xpath("//a[@href ='#textTwo']"));
		actions.moveToElement(link).perform();
		link.click();
	
	}

}
