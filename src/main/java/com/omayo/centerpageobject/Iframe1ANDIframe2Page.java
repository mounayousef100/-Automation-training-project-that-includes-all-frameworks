package com.omayo.centerpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;

public class Iframe1ANDIframe2Page {
	public WebDriver driver;
	Action action = new Action();

	@FindBy(xpath = "//body/h1")
	private WebElement textFromIFrame2;

	public Iframe1ANDIframe2Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void iframe1ANDIframe2() throws InterruptedException {
		Thread.sleep(3000);

		action.switchToFrameById(driver, "iframe1");
		driver.switchTo().parentFrame();
		action.switchToFrameById(driver, "iframe2");
		String text = action.getText(textFromIFrame2);
		System.out.println(text);

		Thread.sleep(4000);
	}
}
