package skinObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HowActive {
	WebDriver driver;
	public HowSpendDay spendDay;

	public HowActive(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Almost no physical activity']")
	 WebElement ele1;
	@FindBy(xpath="//android.widget.TextView[@text='I often go for a walk']")
	 WebElement ele2;
	@FindBy(xpath="//android.widget.TextView[@text='I exercise 1-2 times a week']")
	 WebElement ele3;
	@FindBy(xpath="//android.widget.TextView[@text='I exercise 3-5 times a week']")
	 WebElement ele4;
	@FindBy(xpath="//android.widget.TextView[@text='I exercise 5-7 times a week']")
	 WebElement ele5;
	public void almostNoPhysicalActivity() {
		ele1.click();
		
	}
	public HowSpendDay iOftenGoForWalk() {
		ele2.click();
		spendDay=new HowSpendDay(driver);
		return spendDay;
	}
	public HowSpendDay iExerciseOneTwoTimesAWeek(){
		ele3.click();
		spendDay=new HowSpendDay(driver);
		return spendDay;
		
	}
	public HowSpendDay iExerciseThreeFiveAWeek() {
		ele4.click();
		spendDay=new HowSpendDay(driver);
		return spendDay;
	}
	public HowSpendDay iExerciseFiveSevenAWeek() {
		ele5.click();
		spendDay=new HowSpendDay(driver);
		return spendDay;
		
	}

}
