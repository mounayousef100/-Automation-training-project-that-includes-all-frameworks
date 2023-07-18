package com.omayo.rightpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omayo.actiondriver.Action;

public class GetPromptPage {
	public WebDriver driver;
	Action action = new Action();

	@FindBy(id = "prompt")
	private WebElement getPromptButton;


	public GetPromptPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void getPrompt() throws InterruptedException {
		Thread.sleep(3000);
		action.click(driver, getPromptButton);
		action.AlertAccept(driver);
		action.AlertCancel(driver);
		Thread.sleep(3000);

	}
}
