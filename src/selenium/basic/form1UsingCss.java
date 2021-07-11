package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class form1UsingCss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://practice.testingclub.in/");
		
		driver.findElement(By.cssSelector(".form-control")).sendKeys("amitmeta122@gmail.com");
		
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		
		Thread.sleep(5000);
		
		driver.get("http://practice.testingclub.in/registration/index/formOne");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("amitmeta122@gmail.com");
		
		driver.findElement(By.cssSelector("#form-validate>div:nth-child(2)>div:nth-child(1)>div>input")).sendKeys("xyz@123");
		
		driver.findElement(By.cssSelector("[name='cnfpassword']")).sendKeys("xyz@123");
		
		driver.findElement(By.cssSelector("input[name*='first_']")).sendKeys("Amit");
		
		driver.findElement(By.cssSelector("input[name*='last_']")).sendKeys("Meta");
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("#form-validate>div:nth-child(5)>div>div>div>input")).sendKeys("Roger12");
		
		driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("Hi there");
		
		driver.findElement(By.cssSelector("#submitForm")).click();
		
		System.out.println("Successfully Executed");
		
	}  

}
