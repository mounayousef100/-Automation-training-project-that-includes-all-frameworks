package com.omayo.leftpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omayo.actiondriver.Action;

public class TryItButtonPage {

	public WebDriver driver;
	Action action = new Action();
	
	@FindBy( xpath = "//button[@onclick='setTimeout(myFunctionABC,3000)']")
	private  WebElement tryItButton;
	
	@FindBy(id = "myBtn")
	private  WebElement timerEnableButton;

	public TryItButtonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void TryItButton() throws InterruptedException {
		Thread.sleep(3000);
		action.click(driver, tryItButton);
		Thread.sleep(4000);
		action.isEnabled(driver, timerEnableButton);
		Thread.sleep(3000);
}
	}