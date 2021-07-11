package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class form2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://practice.testingclub.in/");
		
		driver.findElement(By.xpath("/html/body/div/form/div/div[1]/div/input")).sendKeys("amitmeta122@gmail.com");// Absolute Xpath
		
		driver.findElement(By.xpath("/html/body/div/form/div/div[2]/button")).click();//Absolute Xpath
		
		Thread.sleep(5000);
		
		driver.get("http://practice.testingclub.in/registration/index/formTwo");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("amitmeta122@gmail.com");//Basic Xpath
		
		driver.findElement(By.xpath("//*[contains(@name,'password')]")).sendKeys("amitmeta122");//Contains Xpath
		
		driver.findElement(By.xpath("//*[contains(@name,'cnfpassword')]")).sendKeys("amitmeta122");//Contains Xpath
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div/form/div[4]/div[1]/div/input")).sendKeys("Amit");
		
		driver.findElement(By.xpath("//*[@id='form-validate']/div[4]/div[2]/div/input")).sendKeys("Meta");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div/form/div[5]/div[1]/div/div/label[1]/input")).click();
		
		driver.findElement(By.xpath(" //input[@name='movies' and @type='checkbox']")).click();
		
		driver.findElement(By.xpath("//*[@id='form-validate']/div[5]/div[3]/div/div/input")).sendKeys("Roger");
		
		driver.findElement(By.xpath("//*[@id=\"textarea\"]")).sendKeys("Hello I am using selenium for automation");
		
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		
		System.out.println("Executed");

	}

}
