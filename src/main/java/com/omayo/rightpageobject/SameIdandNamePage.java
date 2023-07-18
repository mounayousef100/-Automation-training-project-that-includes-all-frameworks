package com.omayo.rightpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omayo.actiondriver.Action;

public class SameIdandNamePage {
	public WebDriver driver;
	Action action = new Action();

	@FindBy(xpath = "//input[@value='SameIDName']")
	private WebElement sameIdNameButton;


	public SameIdandNamePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void sameIdandName () throws InterruptedException {
		Thread.sleep(3000);
	    action.click(driver, sameIdNameButton);
		Thread.sleep(3000);

	}
}
