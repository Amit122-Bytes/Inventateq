package selenium.basic;



import org.openqa.selenium.By;

public class calender extends login{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		loginmethod();
		
	
		driver.findElement(By.linkText("Gadgets")).click();
		driver.findElement(By.partialLinkText("Calendar")).click();
		
    	driver.findElement(By.xpath("//input[@type='text']")).clear();	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("04/11/2020");
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[6]")).click();
	
		
		
	}
}
