package skinObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Meat {
	WebDriver driver ;

	public Meat(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Chicken']")
	 WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='Fish']")
	 WebElement ele2;
	@FindBy(xpath="//android.widget.TextView[@text='Seafood']")
	 WebElement ele3;
	@FindBy(xpath="//android.widget.TextView[@text='Beef']")
	 WebElement ele4;
	@FindBy(xpath="//android.widget.TextView[@text='I am Vegetarian']")
	 WebElement ele5;
	@FindBy(xpath="//android.widget.TextView[@text='I am Vegan']")
	 WebElement ele6;
	@FindBy(xpath="//android.view.View")
	 WebElement ele7;
	public void nonVeg() {
		ele1.click();
		ele2.click();
		ele3.click();
		ele4.click();
		ele7.click();
	}
	public void vegetarian() {
		ele5.click();
		ele7.click();
	}
	public void vegan() {
		ele6.click();
		ele7.click();
	}

}
