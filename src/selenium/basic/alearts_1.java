package selenium.basic;

import org.openqa.selenium.By;

public class alearts_1 extends login {

	public static void main(String[] args) throws InterruptedException {// Aleart with OK button
		// TODO Auto-generated method stub

		loginmethod();
		alert();
		
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();

		Thread.sleep(2000);

		String text = driver.switchTo().alert().getText();
		System.out.println(text);

		driver.switchTo().alert().accept();

		System.out.println("Executed");

	}

}
