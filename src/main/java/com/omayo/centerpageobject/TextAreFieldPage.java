package com.omayo.centerpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omayo.actiondriver.Action;

public class TextAreFieldPage {
	public WebDriver driver;
	Action action = new Action();

	@FindBy(id = "ta1")
	private WebElement textAreField;


	public TextAreFieldPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void textAreField() throws InterruptedException {
		Thread.sleep(3000);
	    action.typestring(textAreField,"I love quality assurance");
		Thread.sleep(3000);

	}
}
