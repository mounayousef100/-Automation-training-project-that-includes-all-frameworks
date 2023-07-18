package com.omayo.leftpageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.omayo.actiondriver.Action;

public class OpensNewWindowPage {
	public WebDriver driver;
	Action action = new Action();
	SoftAssert mysoft = new SoftAssert();
	@FindBy(id = "link2")
	private WebElement seleniumTutorialLink;


	public OpensNewWindowPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void opensNewWindow() throws InterruptedException {
		Thread.sleep(3000);
		action.click(driver, seleniumTutorialLink);
		Thread.sleep(4000);
		//action.switchToNewWindow(driver);
		String actTitle = action.getTitle(driver);
		String expTitle = "Selenium143";
		System.out.println(actTitle);
		mysoft.assertEquals(actTitle, expTitle, "Title should be Selenium143");
		mysoft.assertAll();
		
		Thread.sleep(4000);

	}
}
