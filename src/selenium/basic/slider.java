package selenium.basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class slider extends login {

	public static void main(String[] args) throws InterruptedException {
		
		loginmethod();
		Actions actions = new Actions(driver);
		driver.findElement(By.linkText("Mouse Actions")).click();
		driver.findElement(By.partialLinkText("Slider")).click();
		WebElement slide=driver.findElement(By.cssSelector("#myRange"));
		actions.clickAndHold(slide).moveByOffset(300, 0).build().perform();
		System.out.println(driver.getTitle());

	}

}
