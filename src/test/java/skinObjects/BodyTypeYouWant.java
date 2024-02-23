package skinObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BodyTypeYouWant {
     WebDriver driver;
	public BodyTypeYouWant(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Fit']")
	WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='Cut']")
	WebElement ele2;
	@FindBy(xpath="//android.widget.TextView[@text='Bulk']")
	WebElement ele3;
	public void fit() {
		ele1.click();
	}
	public void cut() {
		ele2.click();
	}
	public void plump() {
		ele3.click();
	}

}
