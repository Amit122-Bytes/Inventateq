package selenium.basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mousehoverone extends login {
	

	public static void main(String[] args) throws InterruptedException {
	
	loginmethod();
		driver.findElement(By.linkText("Mouse Actions")).click();
		driver.findElement(By.partialLinkText("Hover")).click();
		driver.findElement(By.linkText("Simple Menu")).click();
		Actions actions = new Actions(driver);
		WebElement button = driver.findElement(By.cssSelector(".dropbtn"));
		actions.moveToElement(button).perform();
		WebElement link = driver.findElement(By.xpath("//a[@href ='#textTwo']"));
		actions.moveToElement(link).perform();
		link.click();
		System.out.println(driver.getTitle());
	
	}

}
