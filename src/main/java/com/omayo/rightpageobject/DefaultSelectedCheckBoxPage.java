package com.omayo.rightpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omayo.actiondriver.Action;

public class DefaultSelectedCheckBoxPage {
	public WebDriver driver;
	Action action = new Action();

	@FindBy(id = "checkbox1")
	private WebElement checkbox1;

	@FindBy(id = "checkbox2")
	private WebElement checkbox2;
	
	public DefaultSelectedCheckBoxPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void defaultSelectedCheckBox() throws InterruptedException {
		Thread.sleep(3000);
	    Boolean selectedcheckbox1 = action.isSelected(driver, checkbox1);
	    if (selectedcheckbox1.equals(true)) {
	    	action.click(driver, checkbox1);
	    	action.click(driver, checkbox2);
	    }
		Thread.sleep(3000);
	}
}
