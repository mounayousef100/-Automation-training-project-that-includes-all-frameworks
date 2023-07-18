package com.omayo.centerpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;

public class HTMLFormPage {
	public WebDriver driver;
	Action action = new Action();

	@FindBy(xpath = "//form[@name='form1']/input[1]")
	private WebElement Username;

	@FindBy(xpath = "//form[@name='form1']/input[2]")
	private WebElement Password;

	@FindBy(xpath = "//form[@name='form1']/button")
	private WebElement loginButton;

	public HTMLFormPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	 public void HTMLForm(String name, String pasw) throws InterruptedException {
		Thread.sleep(3000);
		action.typestring(Username, name);
		Thread.sleep(3000);
		action.typestring(Password, pasw);
		action.click(driver, loginButton);
		Thread.sleep(3000);
		action.AlertAccept(driver);
		Thread.sleep(4000);

	}

}
