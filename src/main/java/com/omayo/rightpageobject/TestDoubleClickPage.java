package com.omayo.rightpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TestDoubleClickPage {
	public WebDriver driver;
   // Action action = new Action();
	 Actions actions ;

	@FindBy(id = "testdoubleclick")
	private WebElement doubleClick;

	public TestDoubleClickPage(WebDriver driver) {
		this.driver = driver;
		this.actions = new Actions(driver);
		PageFactory.initElements(driver, this);
	}

	public void testDoubleClick() throws InterruptedException {
		Thread.sleep(3000);
	//	action.doubleClick(driver, doubleClick);
		actions.doubleClick(doubleClick);
		Thread.sleep(2000);

	}
}
