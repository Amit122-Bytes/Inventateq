package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class mutlidropdown extends login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		loginmethod();

		driver.findElement(By.linkText("Gadgets")).click();
		driver.findElement(By.partialLinkText("DropDown")).click();

		WebElement dropdown2 = driver.findElement((By.cssSelector("#multiSelect")));
		Select newtwo = new Select(dropdown2);

		newtwo.selectByIndex(2);
		Thread.sleep(2000);
		newtwo.selectByVisibleText("Brazil");
		Thread.sleep(2000);
		newtwo.selectByValue("IN");

		newtwo.getFirstSelectedOption();
		String textofvalue = newtwo.getFirstSelectedOption().getText();
		System.out.println(textofvalue);

		newtwo.deselectAll();

		newtwo.selectByIndex(8);
		Thread.sleep(2000);
		newtwo.selectByIndex(15);
		Thread.sleep(2000);
		newtwo.selectByVisibleText("Canada");
		Thread.sleep(2000);
		newtwo.selectByVisibleText("Egypt");
		Thread.sleep(2000);
		newtwo.deselectByIndex(14);

		newtwo.deselectByVisibleText("Egpyt");
		Thread.sleep(2000);
		newtwo.deselectByVisibleText("Canada");

		newtwo.getFirstSelectedOption();
		String textofvalue2 = newtwo.getFirstSelectedOption().getText();
		System.out.println(textofvalue2);

		driver.close();

	}

}
