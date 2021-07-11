package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class singledropdown extends login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		loginmethod();
		
		driver.findElement(By.linkText("Gadgets")).click();
		driver.findElement(By.partialLinkText("DropDown")).click();
		
		WebElement dropdown= driver.findElement((By.xpath("//select[@name='country']")));
		Select newone = new Select(dropdown); 
		newone.selectByIndex(3);
		Thread.sleep(2000);
		newone.selectByValue("IN");
		Thread.sleep(2000);
		newone.selectByVisibleText("Nigeria");
		
		newone.getFirstSelectedOption();
		String textofvalue= newone.getFirstSelectedOption().getText();
		System.out.println(textofvalue);
		
	
		System.out.println("Executed");
		System.out.println(driver.getTitle());
		
		
		
	}

}
