package com.omayo.leftpageobject;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;

public class DisplayedAfter10SecondsPage {
	public WebDriver driver;
	Action action = new Action();

	@FindBy( id = "delayedText")
	private  WebElement delayedText;

	public DisplayedAfter10SecondsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void displayedAfter10Seconds() throws InterruptedException {
		Thread.sleep(3000);
		action.explicitWait(driver, delayedText, Duration.ofSeconds(20));
		System.out.println(action.getText(delayedText));
		Thread.sleep(4000);
}
}
