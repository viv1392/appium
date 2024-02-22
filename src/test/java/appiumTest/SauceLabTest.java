package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class SauceLabTest {
	@Test
	public void saucLab() throws MalformedURLException {
	UiAutomator2Options options = new UiAutomator2Options();
	options.setDeviceName("Xiaomi");
	options.setPlatformName("Anroid");
	options.setApp(
			"C:\\Users\\HISPL\\eclipse-workspace\\ProjectAppium\\src\\test\\java\\resorurces\\Android-MyDemoAppRN.1.3.0.build-244.apk");
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	AppiumDriver driver = new AndroidDriver(url, options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='open menu']/android.widget.ImageView")).click();
	}
}
