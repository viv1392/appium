package appUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class Utilities {
    WebDriver driver;
	public Utilities(WebDriver driver) {
		this.driver=driver;
	}
	public void scroll(String text) {
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\""+text+"\"))"))
				.click();
	}
}
