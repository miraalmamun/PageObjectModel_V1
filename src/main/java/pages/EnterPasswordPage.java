package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterPasswordPage {

	public void submitUserName(WebDriver driver, String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("nextbtn")).click();
	}

}
