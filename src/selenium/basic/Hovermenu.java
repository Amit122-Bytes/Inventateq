package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Hovermenu extends login {
	
	public static final By firstmenu= By.linkText("Simple Menu");
	public static final By secondmenu= By.linkText("Horizontal Menu");

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		loginmethod();
		hovermenu();
		
		driver.findElement(firstmenu).click();
		
		
		
		WebElement horixontalmenu= driver.findElement(secondmenu);
		
	

	}

}
