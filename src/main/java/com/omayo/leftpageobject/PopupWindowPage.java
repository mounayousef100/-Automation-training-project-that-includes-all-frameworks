package com.omayo.leftpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import com.omayo.actiondriver.Action;

public class PopupWindowPage {
	public WebDriver driver;
	Action action = new Action();
	SoftAssert mysoft = new SoftAssert();

	@FindBy( xpath = "//div[@id='HTML37']/div[1]/p/a")
	private  WebElement popupWindow;
	
	@FindBy( id = "para1")
	private  WebElement paragraph1;
	
	@FindBy( id = "para2")
	private  WebElement paragraph2;

	public PopupWindowPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void popupWindow() throws InterruptedException {
		Thread.sleep(3000);
		action.click(driver, popupWindow);
		Thread.sleep(4000);
		action.switchToNewWindow(driver);
		String actTextParagraph1 = action.getText(paragraph1);
		String expTextParagraph1 = "A paragraph of text";
		System.out.println(actTextParagraph1);
		mysoft.assertEquals(actTextParagraph1, expTextParagraph1);
		String actTextParagraph2 = action.getText(paragraph2);
		String expTextParagraph2 = "Another paragraph of text";
		System.out.println(actTextParagraph2);
		mysoft.assertEquals(actTextParagraph2,expTextParagraph2);
		mysoft.assertAll();
		Thread.sleep(4000);
}
}
