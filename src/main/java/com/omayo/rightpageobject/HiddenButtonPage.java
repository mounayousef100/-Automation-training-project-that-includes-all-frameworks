package com.omayo.rightpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;

public class HiddenButtonPage {
		public WebDriver driver;
		Action action = new Action();

		@FindBy(id = "hbutton")
		private WebElement HiddenButton;


		public HiddenButtonPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public void hiddenButton() throws InterruptedException {
			Thread.sleep(3000);
			action.isDisplayed(driver, HiddenButton);
			Thread.sleep(3000);

		}
}
