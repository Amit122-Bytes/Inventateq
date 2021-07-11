package selenium.basic;

import org.openqa.selenium.By;

public class aleart_3 extends login {

	public static void main(String[] args) throws InterruptedException {// Alear with TEXT BOX
		// TODO Auto-generated method stub

		loginmethod();
		alert();
	
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[3]/div/button")).click();
		driver.switchTo().alert().sendKeys("Amit Meta");
		
		driver.switchTo().alert().accept();
		String accept = driver.findElement(By.cssSelector("#alertTxt")).getText();
		System.out.println(accept);

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[3]/div/button")).click();
		
		driver.switchTo().alert().dismiss();
		String cancel = driver.findElement(By.cssSelector("#alertTxt")).getText();
		System.out.println(cancel);
		
		System.out.println("Executed");

	}

}
