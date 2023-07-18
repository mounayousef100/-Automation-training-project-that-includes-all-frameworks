package com.omayo.leftpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;

public class TextBoxWithPreloadedTextPage {
	public WebDriver driver;
	Action action = new Action();

	@FindBy(name = "fname")
	private WebElement TextBox;

	public TextBoxWithPreloadedTextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void TextBoxWithPreloaded() throws InterruptedException {
		Thread.sleep(3000);
		action.typestring(TextBox, "qc");
		Thread.sleep(4000);
	}
}
