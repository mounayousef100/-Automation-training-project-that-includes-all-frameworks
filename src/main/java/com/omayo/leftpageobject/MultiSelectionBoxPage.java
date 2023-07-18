package com.omayo.leftpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;

public class MultiSelectionBoxPage {
	public WebDriver driver;
	Action action = new Action();

	@FindBy(id = "multiselect1")
	private WebElement selectionBox;

	@FindBy(id = "drop1")
	private WebElement selectDropdown;
	
	@FindBy(xpath = "//div[@class='widget Text']")
	private WebElement paragraph;
	
	@FindBy(id = "link1")
	private WebElement clickLink1;
	
	public MultiSelectionBoxPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void multiSelectionBox() throws InterruptedException {
		Thread.sleep(3000);
		action.selectByValue(selectionBox, "swiftx");
		Thread.sleep(2000);
		action.click(driver, selectDropdown);
		action.selectByValue(selectDropdown, "jkl");
		System.out.println(action.getText(paragraph));
		action.click(driver, clickLink1);
		

	}
}
