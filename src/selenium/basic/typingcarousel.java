package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class typingcarousel extends login {

	public static void main(String[] args) throws InterruptedException {
		
		loginmethod();
		driver.findElement(By.linkText("Gadgets")).click();
		driver.findElement(By.partialLinkText("Carousel")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='fun']")));
		String classname=driver.findElement(By.xpath("//span[text()='fun']")).getAttribute("class");
		System.out.println(classname);
		System.out.println(driver.getTitle());

	}

}
