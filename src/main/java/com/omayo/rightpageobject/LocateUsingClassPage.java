package com.omayo.rightpageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omayo.actiondriver.Action;

public class LocateUsingClassPage {
	public WebDriver driver;
	Action action = new Action();

	@FindBy(className = "classone")
	private List <WebElement> TextBox;


	public LocateUsingClassPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void locateUsingClass() throws InterruptedException {
		Thread.sleep(3000);
		for( WebElement ele : TextBox) {
			ele.sendKeys("qa");
		}
      
		Thread.sleep(3000);

	}
}
