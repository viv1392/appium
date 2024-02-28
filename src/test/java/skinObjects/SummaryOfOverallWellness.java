package skinObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appUtilities.Utilities;

public class SummaryOfOverallWellness extends Utilities {
	WebDriver driver;

	public SummaryOfOverallWellness(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='18,200,000 + Users']")
	 WebElement ele;
	@FindBy(xpath="//android.view.View")
	 WebElement ele1;
	public void overAllWellness() {
		waitElement(driver,ele);
		ele.click();
	}
}
