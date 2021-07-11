import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amitm\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://practice.testingclub.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("amitmeta122@gmail.com");
		driver.findElement(By.id("sign-in")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Mouse Actions")).click();
		driver.findElement(By.partialLinkText("Drag and Drop")).click();
		driver.findElement(By.xpath("//div[@id='calendar']/div[1]/div[2]/div/button[3]")).click();
		Actions actions = new Actions(driver);
		WebElement event= driver.findElement(By.xpath("//div[text()='My Event 1']"));
		WebElement time= driver.findElement(By.xpath("//tr[7]//td[2]"));
		actions.clickAndHold(event).moveToElement(time).release(time).build().perform();
	
	}

}
