package selenium.basic;

import org.openqa.selenium.By;

public class others extends login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		loginmethod();
		
		driver.findElement(By.linkText("Others")).click();
		driver.findElement(By.partialLinkText("Check List")).click();
		
	} 
	
	

}
