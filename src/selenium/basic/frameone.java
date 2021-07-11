package selenium.basic;

import org.openqa.selenium.By;

public class frameone extends login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		loginmethod();
		frames();
		
	
		// -------------First Alert---------------------------//
//
//		driver.findElement(By.cssSelector(".nav-link")).click();
//		driver.switchTo().frame("frameOne");
//		driver.findElement(By.linkText("Alert with OK Button")).click();
//		System.out.println("First Alert");
//		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
//		driver.switchTo().alert().accept();

		// ------------Second Alert----------------------------//

//		driver.findElement(By.linkText(" Alert with OK and Cancel buttons")).click();
//		driver.findElement(By.xpath("//div[@id='alertTwo']/div[1]/button")).click();
//		driver.switchTo().alert().accept();
//		String oktext = driver.findElement(By.cssSelector("#alertResult")).getText();
//		System.out.println(oktext);
//		driver.findElement(By.xpath("//div[@id='alertTwo']/div[1]/button")).click();
//		driver.switchTo().alert().dismiss();
//		String canceltext = driver.findElement(By.cssSelector("#alertResult")).getText();
//		System.out.println(canceltext);

		// ------------------Third Alert-------------------------//
		driver.findElement(By.cssSelector(".nav-link")).click();
		driver.switchTo().frame("frameOne");
		driver.findElement(By.xpath("//div[@class='content chat-wrapper frame']/div/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//div[@id='alertThree']/div[1]/button")).click();
		driver.switchTo().alert().sendKeys("Amit Meta");
		driver.switchTo().alert().accept();
		String accept = driver.findElement(By.cssSelector("#alertTxt")).getText();
		System.out.println(accept);
		driver.findElement(By.xpath("//div[@id='alertThree']/div[1]/button")).click();
		driver.switchTo().alert().dismiss();
		String cancel = driver.findElement(By.cssSelector("#alertTxt")).getText();
		System.out.println(cancel);
		System.out.println("Executed");
		
		System.out.println(driver.getTitle());

	}

}
