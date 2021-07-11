package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class form1 extends login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		loginmethod();

		driver.get("http://practice.testingclub.in/registration/index/formOne");

		driver.findElement(By.id("email"))
				.sendKeys("amitmeta122@gmail.com" + Keys.TAB + "Amit@xyz" + Keys.TAB + "Amit@xyz" + Keys.TAB + "Amit"
						+ Keys.TAB + "Meta" + Keys.TAB + "Roger122" + Keys.TAB + "Hi" + Keys.TAB + Keys.ENTER);

//		driver.findElement(By.name("password")).sendKeys("Amit@xyz");
//
//		driver.findElement(By.name("cnfpassword")).sendKeys("Amit@xyz");
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.name("first_name")).sendKeys("Amit");
//
//		driver.findElement(By.name("last_name")).sendKeys("Meta");
//
//		driver.findElement(By.className("username")).sendKeys("Roger122");
//
//		//driver.findElement(By.className("form-control")).sendKeys("Roger122");
//
//		driver.findElement(By.id("textarea")).sendKeys("Hi there is this for Automation");
//
//		driver.findElement(By.id("submitForm")).click();
//
//		Thread.sleep(3000);

		System.out.println(driver.getTitle());
		System.out.println("Successfully Automated");

		driver.quit();
	}
}
