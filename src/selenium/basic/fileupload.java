package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class fileupload extends login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		loginmethod();
		
		driver.findElement(By.linkText("Gadgets")).click();
		driver.findElement(By.partialLinkText("File Upload")).click();
		
		WebElement imgupload = driver.findElement(By.xpath("//input[@id=\"imgInp\"]"));
		imgupload.sendKeys("D:\\xyz.png");
		System.out.println(driver.getTitle());
		
		
	}

}
