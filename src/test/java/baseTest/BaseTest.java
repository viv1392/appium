package baseTest;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import skinObjectsRegestration.CountryLandingSkin;

public class BaseTest {
	public WebDriver driver;
	public CountryLandingSkin country;

	public WebDriver driverSetUp() throws IOException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Android Device");
		options.setPlatformName("Anroid");
		options.setApp("C:\\Users\\HISPL\\eclipse-workspace\\ProjectAppium\\resorurces\\app-release.apk");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		WebDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}

	@BeforeMethod
	public void popUp() throws IOException {
		driver = driverSetUp();
		driver.findElement(By.xpath(
				"//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']"))
				.click();
		driver.findElement(By.xpath(
				"//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']"))
				.click();
		country = new CountryLandingSkin(driver);
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
