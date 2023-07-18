package com.omayo.rightpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;

public class ImageElementPage {
	public WebDriver driver;
	Action action = new Action();


	@FindBy(xpath = "//div[@class='widget-content']//img")
	private WebElement image;

	public ImageElementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void displayedImage() throws InterruptedException {
		Thread.sleep(3000);
		action.isDisplayed(driver,image);
		

	}
}
