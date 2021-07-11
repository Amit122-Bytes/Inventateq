package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://hrm.testingclub.in/symfony/web/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys("automation");// By ID
		
		driver.findElement(By.name("txtPassword")).sendKeys("Automation@123");// By sname
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[5]/input")).click();// Absoultive Xpath
		
		Thread.sleep(5000);
		
		driver.get("http://hrm.testingclub.in/symfony/web/index.php/pim/addEmployee");
		
		driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Ranjan");// Relative Xpath
		
		driver.findElement(By.xpath("//input[@id=\"middleName\"]")).sendKeys("Kumar");// Relative Xpath
		
		driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Sadhukhan");// Relative Xpath
		
//		driver.findElement(By.name("employeeId")).sendKeys("111");
		
		driver.findElement(By.name("chkLogin")).click();
		
		driver.findElement(By.name("user_name")).sendKeys("Ranjan123");
		
		driver.findElement(By.name("user_password")).sendKeys("Ranjanxyz@21102001");
		
		driver.findElement(By.name("re_password")).sendKeys("Ranjanxyz@21102001");
		
		driver.findElement(By.id("btnSave")).click();
		
		Thread.sleep(5000);
		
		driver.get("http://hrm.testingclub.in/symfony/web/index.php/pim/viewEmployeeList/reset/1");
		
		System.out.println("Sucessfully Added");
		
		

	}

}
