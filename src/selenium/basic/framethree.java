package selenium.basic;

import org.openqa.selenium.By;

public class framethree extends login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		loginmethod();
		frames();
		
		driver.findElement(By.xpath("//div[@class='content chat-wrapper']/div/div/ul/li[3]/a")).click();
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Nunber of Frames= "+ size);
		
		driver.switchTo().frame("frameMTL");
		driver.switchTo().frame(0);
		driver.findElement(By.name("data-msg")).sendKeys("Amit Meta");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/button")).click();
		
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("frameMTL");
		driver.switchTo().frame(driver.findElement(By.cssSelector("#frame-dummy")));
		String text=driver.findElement(By.xpath("/html/body/div[3]/div[7]/div/div/div[3]/div/div[2]/div[2]/div/div[1]/p[1]")).getText();
		System.out.println(text);

	}

}
