package selenium.basic;

import org.openqa.selenium.By;

public class aleart_2 extends login{

	public static void main(String[] args) throws InterruptedException {// Aleart with OK AND CANCEL Button
		// TODO Auto-generated method stub
		
		loginmethod();
		alert();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[2]/div/button")).click();
		
		driver.switchTo().alert().accept();
		String oktext= driver.findElement(By.cssSelector("#alertResult")).getText();
		System.out.println(oktext);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[2]/div/button")).click();
		
		driver.switchTo().alert().dismiss();
		String canceltext=driver.findElement(By.cssSelector("#alertResult")).getText();
		System.out.println(canceltext);
		
		System.out.println("Executed");
		
		

	}

}
