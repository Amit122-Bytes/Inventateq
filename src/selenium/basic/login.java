package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static WebDriver driver;

	public static void loginmethod() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://practice.testingclub.in/");

		driver.findElement(By.name("email")).sendKeys("amitmeta122@gmail.com");

		driver.findElement(By.id("sign-in")).click();

		Thread.sleep(5000);
	}
	
	public static void alert() {
		
		driver.findElement(By.xpath("/html/body/div[2]/aside/div/ul/li[3]/a/span")).click();
		driver.findElement(By.partialLinkText("Alerts")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/ul/li[3]/a")).click();
	}
	
	public static void windowsopen() {
		
		driver.findElement(By.xpath("/html/body/div[2]/aside/div/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[2]/aside/div/ul/li[3]/ul/li[3]/a")).click();
		
	}
	
	public static void frames() {
		
		driver.findElement(By.linkText("Switch To")).click();
		driver.findElement(By.partialLinkText("Frames")).click();
	}
	
	public static void hovermenu()
	{
		driver.findElement(By.linkText("Mouse Actions")).click();
		driver.findElement(By.partialLinkText("Hover Menus")).click();
	}
	
	public static void draganddrop()
	{
		driver.findElement(By.linkText("Mouse Actions")).click();
		driver.findElement(By.partialLinkText("Drag and Drop")).click();
	}
	
	public static void slider()
	{
		driver.findElement(By.linkText("Mouse Actions")).click();
		driver.findElement(By.partialLinkText("Slider")).click();
	}
	
}

