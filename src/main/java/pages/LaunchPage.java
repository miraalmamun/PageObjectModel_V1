package pages;

import org.openqa.selenium.WebDriver;

public class LaunchPage {

	public HomePage navigateToHomePage(WebDriver driver) {

		driver.get("https://www.zoho.com/");
		System.out.println(driver.getTitle());

		return new HomePage();

	}

}
