package com.omayo.centerpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;

public class TextAreaFieldTwoPage {
	public WebDriver driver;
	Action action = new Action();

	@FindBy(xpath = "//div[@class='widget-content']/textarea[@cols='30']")
	private WebElement textAreField2;


	public TextAreaFieldTwoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void textAreField() throws InterruptedException {
		Thread.sleep(3000);
	    action.typestring(textAreField2,"I love quality assurance 2");
		Thread.sleep(3000);

	}
}
