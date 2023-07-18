package com.omayo.leftpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;

public class EnabledButtonPage {
	public WebDriver driver;
	Action action = new Action();

	
	@FindBy(id = "but2")
	private WebElement enabledButton;
	
	@FindBy(id = "but1")
	private WebElement  disabledButton;
	

	public EnabledButtonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void  enabledButton() throws InterruptedException {
		Thread.sleep(3000);
		action.isEnabled(driver, enabledButton);
		action.isEnabled(driver, disabledButton);
		Thread.sleep(4000);

	}
	public void disabledButton() throws InterruptedException {
		Thread.sleep(3000);
		action.isDisplayed(driver, disabledButton);
		Thread.sleep(4000);
	}

}

