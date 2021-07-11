package selenium.basic;

import java.util.Set;

import org.openqa.selenium.By;

public class windowsoperation extends login {

	public static void main(String[] args) throws InterruptedException {
		loginmethod();
		driver.findElement(By.linkText("Switch To")).click();
		driver.findElement(By.partialLinkText("Windows")).click();
		driver.findElement(By.linkText("Open in new tab")).click();
		driver.findElement(By.cssSelector("#buttonOne")).click();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl()); // will give the url of the page
		System.out.println(driver.getTitle()); // title of the page

		/*
		 * Window Handlers driver.getWindowHandle() it will give you the ID of the
		 * tab/window - String driver.getWindowHandles() all windows IDs
		 */
		String testingClubWindow = driver.getWindowHandle();
		System.out.println(testingClubWindow);
		handleWindows();
		driver.switchTo().window(testingClubWindow);
		driver.findElement(By.linkText("Open in new window")).click();
		driver.findElement(By.cssSelector("#buttonTwo")).click();
		handleWindows();

	}

	public static void loginmethod() {
		// TODO Auto-generated method stub

	}

	public static void handleWindows() {
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		for (String currentWindow : allWindows) {
			System.out.println(currentWindow);
			driver.switchTo().window(currentWindow);
			System.out.println(driver.getCurrentUrl()); // will give the url of the page
			System.out.println(driver.getTitle()); // title of the page
			if (driver.getTitle().contains("Prasanna")) {
				String name = driver.findElement(By.cssSelector(".rightProfileHead .profile-name")).getText();
				System.out.println(name);
				driver.navigate().refresh();
				driver.close(); // close the active tab/window. .quit()- close the browser

			}
		}
	}

}