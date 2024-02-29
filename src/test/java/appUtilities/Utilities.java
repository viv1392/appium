package appUtilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import io.appium.java_client.AppiumBy;


public class Utilities {
	
	public void scroll(String text,WebDriver driver) {
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\""+text+"\"))"))
				.click();
	}
	public void waitElement(WebDriver driver,WebElement ele1) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(ele1));
		
	}
	public String emailRandom() {
		Faker faker=new Faker();
		String x=faker.internet().emailAddress();
		return x;
	}
	public void back(WebDriver driver) {
		driver.navigate().back();
			
	}
}
	

