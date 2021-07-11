package selenium.basic;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class windows extends login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		loginmethod();
		windowsopen();

		driver.findElement(By.cssSelector(".nav-link")).click();
		driver.findElement(By.cssSelector("#buttonOne")).click();

		String testingClubWindow = driver.getWindowHandle();
		Set<String> alltabs = driver.getWindowHandles();

		for (String presentwindow : alltabs) {
			System.out.println(presentwindow);
			driver.switchTo().window(presentwindow);
			if (driver.getTitle().contains("Prasanna")) {
				String text = driver.findElement(By.cssSelector(".rightProfileHead .profile-name")).getText();
				System.out.println(text);
			}
		}
		
		driver.get("http://practice.testingclub.in/dashboard/profile");
		driver.findElement(By.cssSelector(".user-name")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div/ul")).click();
		Thread.sleep(3000);
		
		driver.switchTo().window(testingClubWindow);
		driver.navigate().refresh();

		System.out.println("Executed");
	}
}
