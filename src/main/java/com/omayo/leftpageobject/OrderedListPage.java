package com.omayo.leftpageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.omayo.actiondriver.Action;

public class OrderedListPage {
	public WebDriver driver;
	Action action = new Action();
	SoftAssert mysoft = new SoftAssert();
	@FindBy(xpath = "//div[@class='widget-content']/ol/li")
	private List< WebElement> orderedList;


	public OrderedListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void orderedList() throws InterruptedException {
		Thread.sleep(3000);
		for(WebElement order:orderedList) {
		System.out.println(action.getText(order));
		
		}
		Thread.sleep(4000);
}
}
