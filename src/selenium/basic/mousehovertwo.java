package selenium.basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehovertwo extends login {
	

	public static void main(String[] args) throws InterruptedException {
	
		loginmethod();
	
		driver.findElement(By.linkText("Mouse Actions")).click();
		driver.findElement(By.partialLinkText("Hover")).click();
		driver.findElement(By.linkText("Horizontal Menu")).click();
		Actions actions = new Actions(driver);
//		WebElement home = driver.findElement(By.linkText("HOME"));
//		actions.moveToElement(home).perform();
//		WebElement link = driver.findElement(By.partialLinkText("Sub-Menu 3"));
//		actions.moveToElement(link).perform();
//		Thread.sleep(2000);
		WebElement categories = driver.findElement(By.linkText("CATEGORIES"));
		actions.moveToElement(categories).perform();
		WebElement sumenu = driver.findElement(By.partialLinkText("Sub-Menu 3"));
		actions.moveToElement(sumenu).perform();
		WebElement extendsubmenu = driver.findElement(By.partialLinkText("Sub Sub-Menu 5"));
		actions.moveToElement(extendsubmenu).perform();
	
	}

}
