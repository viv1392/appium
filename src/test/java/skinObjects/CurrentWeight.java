package skinObjects;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;

public class CurrentWeight {
	WebDriver driver;
	public PerfectWeight perfectWeight;

	public CurrentWeight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Lb']")
	 WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='96']")
	 WebElement ele2;
	@FindBy(xpath="//android.widget.TextView[@text='97']")
	 WebElement ele3;
	@FindBy(xpath="//android.widget.TextView[@text='98']")
	 WebElement ele4;
	@FindBy(xpath="//android.widget.TextView[@text='Continue']")
	 WebElement ele;
	public PerfectWeight currentWeightLb() {
		ele1.click();
		ele2.click();
		ele3.click();
		ele4.click();
		//driver.findElement(AppiumBy.androidUIAutomator(
				//"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"204\"))"))
				//.click();
		ele.click();
		perfectWeight=new PerfectWeight(driver);
		return perfectWeight;
	}
	public PerfectWeight currentWeightKg() {
		//code here
		perfectWeight=new PerfectWeight(driver);
		return perfectWeight;
	}

}
