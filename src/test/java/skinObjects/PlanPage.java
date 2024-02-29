package skinObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appUtilities.Utilities;
import io.appium.java_client.AppiumBy;

public class PlanPage extends Utilities{
	WebDriver driver;

	public PlanPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Got It!']")
	 WebElement ele1;
	public void sixMonthPlan() {
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Buy Now\"))"))
				.click();
		back(driver);
		back(driver);
		ele1.click();
		back(driver);
	}
	public void oneMonthPlan() {
		
	}
	public void threeMonthPlan() {
		
	}

}
