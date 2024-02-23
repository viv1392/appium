package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.google.common.collect.ImmutableMap;

import baseTest.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import skinObjects.BodyTypeYouWant;
import skinObjects.CurrentBodyType;
import skinObjects.GenderSelection;

public class KetoTest extends BaseTest {
	GenderSelection gender;
	CurrentBodyType currentBody;
	BodyTypeYouWant bodyPref;
	@Test
	public void ketoMenTest() throws MalformedURLException, Throwable {
		gender=country.countrySelection();
		currentBody=gender.genderSelectionMen();
		bodyPref=currentBody.plump();
		bodyPref.fit();
		
		//driver.findElement(By.xpath(
				//"//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"))
				//.click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Plump']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Fit']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Loose weight']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Boost brain power']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Improve bone health']")).click();
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Reduce the risk of cancer\"))"))
				.click();

		driver.findElement(By.xpath("//android.view.View")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Belly']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Butt']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Pecs']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Legs']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='More than 4 years ago']")).click();
		driver.findElement(By.xpath("//android.view.View")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='More than 1 hour']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Chicken']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Fish']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Seafood']")).click();
		driver.findElement(By.xpath("//android.view.View")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Broccoli']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Zucchini']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Lettuce']")).click();
		driver.findElement(By.xpath("//android.view.View")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Cheese']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Coconut']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Olives']")).click();
		driver.findElement(By.xpath("//android.view.View")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='I often go for a walk']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='I spend pretty much time on foot']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='I eat late at night']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='I like soft drinks']")).click();
		driver.findElement(By.xpath("//android.view.View")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='I want to try and lose some weight']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Cm']")).click();
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"183\"))"))
				.click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
		
		

		driver.findElement(By.xpath("//android.widget.TextView[@text='43']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='44']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='45']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='46']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='47']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='48']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='49']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='50']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='51']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='52']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='53']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='54']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='55']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='56']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='57']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='58']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='59']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='60']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='61']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='62']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='63']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='64']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='65']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='66']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='67']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='68']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='69']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='70']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='71']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='72']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='73']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='74']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='75']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='76']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='77']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='78']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='79']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='80']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='81']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='82']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='83']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='84']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"75\"))"))
				.click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"37\"))"))
				.click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement ele1 = driver.findElement(By.xpath("//android.widget.TextView[@text='18,200,000 + Users']"));
		wait.until(ExpectedConditions.invisibilityOf(ele1));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
		// driver.findElement(By.xpath("//android.widget.TextView[@text='Vacation']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Wedding']")).click();

		// modification from here

		driver.findElement(By.xpath("//android.widget.TextView[@text='DD - MM - YYYY']")).click(); // date selection
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='March']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='April']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@resource-id='android:id/button1']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
		Faker fkr = new Faker();
		String mail = fkr.internet().emailAddress();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Your Email Id']")).sendKeys(mail);
		driver.findElement(By.xpath(
				"//android.widget.TextView[@text='By checking this, you agree to get future information from us']"))
				.click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='I agree to the Privacy Policy']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='I agree']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Get your plan']")).click();
		Thread.sleep(1000);

		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Buy Now\"))"))
				.click();
                   
		// driver.quit();
		// service.stop();
	}

}
