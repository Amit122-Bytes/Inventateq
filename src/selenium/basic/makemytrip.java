package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {

public static WebDriver driver;
	
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='makeFlex hrtlCenter prependTop5 appendBottom40' ]/ul/li[6]")).click();
		
		//------------------From-----------------//
		
		driver.findElement(By.cssSelector("div.fsw_inputBox:nth-child(1) > label:nth-child(1)")).click();
		WebElement FROM= driver.findElement(By.xpath("//div[@role='combobox' ]/input"));
		FROM.sendKeys("Goa,India");
		Thread.sleep(3000);
		FROM.sendKeys(Keys.ARROW_DOWN);
		FROM.sendKeys(Keys.ENTER);
		
		//--------------To-------------------------//
		
		driver.findElement(By.cssSelector("div.fsw_inputBox:nth-child(3)")).click();
		WebElement TO=driver.findElement(By.cssSelector(".react-autosuggest__input"));
		TO.sendKeys("Pune,India");
		Thread.sleep(3000);
		TO.sendKeys(Keys.ARROW_DOWN);
		TO.sendKeys(Keys.ENTER);
		//-------------------------Departure----------------------//
		
		driver.findElement(By.cssSelector("div.fsw_inputBox:nth-child(4)")).click();
		driver.findElement(By.xpath("//div[@class='DayPicker-Month' ]//div[@class='DayPicker-Body']/div[2]/div[2]")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='makeFlex' ]/ul/li[2]")).isSelected());
		//---------------------------Return--------------------------//
		
        driver.findElement(By.cssSelector("div.fsw_inputBox:nth-child(5)")).click();
		driver.findElement(By.xpath("//div[@class='DayPicker-Month' ][2]//div[@class='DayPicker-Body']/div[4]/div[4]")).click();
		
		//---------------------------------Travellers and Class------------------------//
		
		System.out.println(driver.findElement(By.xpath("//div[@class='makeFlex' ]/ul/li[2]")).getAttribute("class"));
		
		driver.findElement(By.cssSelector("div.fsw_inputBox:nth-child(6)")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='travellers']/div/ul/li[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".makeFlex.appendBottom25>div>ul>li:nth-child(3)")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".makeFlex.column.pushRight>ul>li:nth-child(2)")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='appendBottom20' ]/ul[2]/li[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".primaryBtn.btnApply.pushRight")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".primaryBtn.font24.latoBold ")).click();
		driver.close();
		
	}

}
