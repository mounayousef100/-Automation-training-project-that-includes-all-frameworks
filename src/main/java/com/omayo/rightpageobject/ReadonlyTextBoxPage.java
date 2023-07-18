package com.omayo.rightpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;

public class ReadonlyTextBoxPage {
	public WebDriver driver;
	Action action = new Action();

	@FindBy(xpath = "//div[@class ='widget-content']//input[@id='rotb']")
	private WebElement readonlyTextBox;

	public ReadonlyTextBoxPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void  readonlyTextBox() throws InterruptedException {
		Thread.sleep(3000);
		action.typestring(readonlyTextBox, "hi");
		Thread.sleep(3000);
	}
}
