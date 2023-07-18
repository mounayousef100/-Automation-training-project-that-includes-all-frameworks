package com.omayo.leftpageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.omayo.actiondriver.Action;

public class UnOrderedListPage {
	public WebDriver driver;
	Action action = new Action();
	SoftAssert mysoft = new SoftAssert();
	@FindBy(xpath = "//div[@class='widget HTML']/div/ul/li")
	private List< WebElement> unOrderedList;


	public UnOrderedListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void unOrderedList() throws InterruptedException {
		Thread.sleep(3000);
		for(WebElement UnOrder:unOrderedList) {
		System.out.println(action.getText(UnOrder));
		
		}
		Thread.sleep(4000);
}
}
