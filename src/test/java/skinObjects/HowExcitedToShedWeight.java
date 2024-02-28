package skinObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HowExcitedToShedWeight {
     WebDriver driver;
     public  HowTall tall;
	public HowExcitedToShedWeight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Just Want to See how Keto Diet helps in weight loss']")
	 WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='I want to try and lose some weight']")
	 WebElement ele2;
	public HowTall ketoDietHelps() {
		ele1.click();
		tall=new  HowTall(driver);
		return tall;
	}
	public HowTall wantToLose() {
		ele2.click();
		tall=new  HowTall(driver);
		return tall;
	}
}
