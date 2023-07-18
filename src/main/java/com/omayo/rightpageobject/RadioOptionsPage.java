package com.omayo.rightpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.omayo.actiondriver.Action;

public class RadioOptionsPage {
	public WebDriver driver;
	Action action = new Action();

	@FindBy(id = "radio1")
	private WebElement  radioOption1;

	@FindBy(id = "radio2")
	private WebElement  radioOption2;
	
	public RadioOptionsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectRadio() throws InterruptedException {
		Thread.sleep(3000);
		action.click(driver, radioOption1);
		action.isSelected(driver, radioOption1);
		action.click(driver, radioOption2);
		action.isSelected(driver, radioOption2);
	}
}
