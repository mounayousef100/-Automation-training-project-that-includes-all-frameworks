package com.omayo.rightpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.omayo.actiondriver.Action;

public class SearchThisBlogPage {
	public WebDriver driver;
	Action action = new Action();
	SoftAssert mysoft = new SoftAssert();

	@FindBy(name = "q")
	private WebElement searchField;

	@FindBy(name = "pswrd")
	private WebElement searchButton;

	@FindBy(className = "status-msg-body")
	private WebElement messageText;

	public SearchThisBlogPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void searchThisBlog() throws InterruptedException {
		Thread.sleep(3000);
		action.typestring(searchField, "a");
		Thread.sleep(3000);
		action.click(driver,searchButton);
		String actMessage = action.getText(messageText);
		String expectMessage = "Showing posts sorted by relevance for query a. Sort by date Show all posts" ;
		mysoft.assertEquals(actMessage, expectMessage);
		mysoft.assertAll();
		Thread.sleep(4000);

	}
}
