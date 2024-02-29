package appiumTest;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import baseTest.BaseTest;
import io.appium.java_client.AppiumBy;
import skinObjects.AnySpecialOccasionToLoseWeight;
import skinObjects.BodyTypeYouWant;
import skinObjects.CurrentBodyType;
import skinObjects.CurrentWeight;
import skinObjects.EmailId;
import skinObjects.EventsDate;
import skinObjects.GenderSelection;
import skinObjects.HowActive;
import skinObjects.HowExcitedToShedWeight;
import skinObjects.HowSpendDay;
import skinObjects.HowTall;
import skinObjects.LastHappy;
import skinObjects.MealPreparationTime;
import skinObjects.Meat;
import skinObjects.OneAndOnlyPlan;
import skinObjects.OtherFoodItems;
import skinObjects.PerfectWeight;
import skinObjects.PlanPage;
import skinObjects.SelectMultipleAnswer;
import skinObjects.SocialCustomersPage;
import skinObjects.SummaryOfOverallWellness;
import skinObjects.TargetZone;
import skinObjects.Veggies;
import skinObjects.WhatDoYouWantToAchieve;
import skinObjects.YourAge;
import skinObjects.YourWeight;

public class KetoTest extends BaseTest {
	GenderSelection gender;
	CurrentBodyType currentBody;
	BodyTypeYouWant bodyPref;
	WhatDoYouWantToAchieve achieve;
	SocialCustomersPage social;
	TargetZone targetzone;
	LastHappy happy;
	MealPreparationTime time;
	Meat meat;
	Veggies veggies;
	OtherFoodItems otherItems;
	HowActive active;
	HowSpendDay spendDay;
	SelectMultipleAnswer multipleAnswer;
	HowExcitedToShedWeight shedWeight;
	HowTall tall;
	CurrentWeight currentWeight;
	PerfectWeight perfectWeight;
	YourAge age;
	SummaryOfOverallWellness wellness;
	AnySpecialOccasionToLoseWeight occassion;
	EventsDate date;
	OneAndOnlyPlan plan;
	YourWeight weight;
	EmailId email;
	PlanPage planPage;

	@Test(testName = "men")
	public void MenNonVegTest() throws MalformedURLException, Throwable {
		gender = country.countrySelection();
		currentBody = gender.genderSelectionMen();
		bodyPref = currentBody.plump();
		achieve = bodyPref.fit();
		achieve.looseWeight();
		achieve.boostBrainPowe();
		achieve.reduceCholestrolLevel();
		achieve.improveBoneHealth();
		social = achieve.cont();
		targetzone = social.socialPage();
		targetzone.belly();
		targetzone.butt();
		targetzone.pecs();
		targetzone.legs();
		happy = targetzone.cont();
		happy.never();
		time = happy.contt();
		meat = time.upTo1hr();
		veggies = meat.nonVeg();
		otherItems = veggies.veggies();
		active = otherItems.nonVegUser();
		spendDay = active.iExerciseOneTwoTimesAWeek();
		multipleAnswer = spendDay.atWorkPlace();
		shedWeight = multipleAnswer.multipleAnswer();
		tall = shedWeight.wantToLose();
		currentWeight = tall.howTallInFeet();
		perfectWeight = currentWeight.currentWeightLb();
		age = perfectWeight.perfectWeightInLb();
		wellness = age.yourAge();
		occassion = wellness.overAllWellness();
		date = occassion.specialEvent();
		plan = date.eventDate();
		weight = plan.oneAndOnlyPlan();
		email = weight.yourWeight();
		planPage = email.emailId();
		planPage.sixMonthPlan();
	}

	@Test(testName = "women")
	public void womenVegan() throws InterruptedException {
		gender = country.countrySelection();
		currentBody = gender.genderSelectionWomen();
		bodyPref = currentBody.extra();
		achieve = bodyPref.fit();
		achieve.looseWeight();
		achieve.boostBrainPowe();
		achieve.reduceCholestrolLevel();
		achieve.improveBoneHealth();
		social = achieve.cont();
		targetzone = social.socialPage();
		targetzone.belly();
		targetzone.butt();
		targetzone.pecs();
		targetzone.legs();
		happy = targetzone.cont();
		happy.never();
		time = happy.contt();
		meat = time.upTo1hr();
		veggies = meat.vegan();
		otherItems = veggies.veggies();
		active = otherItems.veganUser();
		spendDay = active.iOftenGoForWalk();
		multipleAnswer = spendDay.atWorkPlace();
		shedWeight = multipleAnswer.multipleAnswer();
		tall = shedWeight.wantToLose();
		currentWeight = tall.howTallInCm();
		perfectWeight = currentWeight.currentWeightLb();
		age = perfectWeight.perfectWeightInLb();
		wellness = age.yourAge();
		occassion = wellness.overAllWellness();
		plan = occassion.noEvent();
		weight = plan.oneAndOnlyPlan();
		email = weight.yourWeight();
		planPage = email.emailId();
		planPage.sixMonthPlan();

	}
}
