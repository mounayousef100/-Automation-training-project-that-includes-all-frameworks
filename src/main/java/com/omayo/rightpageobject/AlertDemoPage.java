package com.omayo.rightpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omayo.actiondriver.Action;

public class AlertDemoPage {
	public WebDriver driver;
	Action action = new Action();

	@FindBy(id = "alert1")
	private WebElement clickToGetAlert;
	
	public AlertDemoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickToGetAlert() throws InterruptedException {
		Thread.sleep(3000);
		action.click(driver, clickToGetAlert);
        action.AlertAccept(driver);
        Thread.sleep(3000);
}
}