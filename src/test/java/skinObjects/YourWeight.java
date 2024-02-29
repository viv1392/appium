package skinObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourWeight {
       WebDriver driver;
       public EmailId email;
	public YourWeight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Continue']")
	 WebElement ele5;
	public EmailId yourWeight() {
		ele5.click();
		email=new EmailId(driver);
		return email;
	}

}
