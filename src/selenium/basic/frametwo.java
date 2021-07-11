package selenium.basic;

import org.openqa.selenium.By;

public class frametwo extends login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		loginmethod();
		frames();

		//-------------First frame-----------------//
		driver.findElement(By.linkText("Multiple iFrames")).click();
		driver.switchTo().frame("multi-frames");
		driver.findElement(By.cssSelector(".form-control")).sendKeys("Amit Meta");
		driver.findElement(By.xpath("//div[@class='auth-footer']/button")).click();
		System.out.println("Executed");
		
		//------------Second Frame------------------//
		driver.switchTo().frame("frameUP");
		String text = driver.findElement(By.cssSelector("p.profile-name")).getText();
	    System.out.println(text);
	    System.out.println(driver.getTitle());
		
		}

}
