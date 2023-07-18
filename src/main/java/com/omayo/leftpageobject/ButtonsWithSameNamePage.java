package com.omayo.leftpageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.omayo.actiondriver.Action;

public class ButtonsWithSameNamePage {
	public WebDriver driver;
	Action action = new Action();
	SoftAssert mysoft = new SoftAssert();
	@FindBy(xpath = "//div[@class='widget-content']//button[@name='samename']")
	private List< WebElement> ButtonsWithSameName;


	public ButtonsWithSameNamePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void buttonsWithSameName() throws InterruptedException {
		Thread.sleep(3000);
		for(WebElement button:ButtonsWithSameName) {
		action.click(driver, button);
		Thread.sleep(3000);
		}
		Thread.sleep(4000);
}
}