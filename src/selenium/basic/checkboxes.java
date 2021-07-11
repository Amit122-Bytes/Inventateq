package selenium.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args) throws InterruptedException {

// selenium script --->  browser drivers -----> chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pvpsu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://practice.testingclub.in/");

// WebElement - element
		WebElement emailInput = driver.findElement(By.name("email"));
		String email = "prasanna.testingclub@gmail.com";
		emailInput.clear();
		Thread.sleep(3000);
		emailInput.sendKeys(email);
		/*
		 * Thread.sleep(3000); emailInput.clear(); Thread.sleep(3000);
		 * emailInput.sendKeys("prasanna@testingclub.in");
		 */
		String btnText = driver.findElement(By.tagName("button")).getText();
		System.out.println("button text is: " + btnText);
		if ("Lets Automate".equals(btnText))
			System.out.println("PASS");
		else
			System.out.println("FAIL");

		driver.findElement(By.id("sign-in")).click();

		Thread.sleep(5000);
		boolean emailLabel = driver.findElement(By.xpath("//td[text()='" + email + "']")).isDisplayed();
		System.out.println("email is is displayed? " + emailLabel);
		driver.findElement(By.linkText("Registration Form")).click();
		driver.findElement(By.partialLinkText("2")).click();
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		System.out.println(driver.findElement(By.cssSelector("[type='checkbox']")).isSelected());
		
// Thread.sleep(60);
// List<WebElement> checkBoxes = driver.findElements(By.cssSelector("[type='checkbox']"));
// System.out.println("no.of checkboxes are " + checkBoxes.size());
// for(WebElement currentCB : checkBoxes) {
// System.out.println(currentCB);
// currentCB.click();
// System.out.println(currentCB.getAttribute("name") + " is clicked");
// Thread.sleep(2000);
// }

	}

}
