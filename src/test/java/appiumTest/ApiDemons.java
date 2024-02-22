package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class ApiDemons {
	@Test
	public void apiDemons() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Xiaomi");
		options.setPlatformName("Anroid");
		options.setApp(
				"C:\\Users\\HISPL\\eclipse-workspace\\ProjectAppium\\src\\test\\java\\resorurces\\ApiDemos-debug.apk");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView3\"));"));
	}

}
