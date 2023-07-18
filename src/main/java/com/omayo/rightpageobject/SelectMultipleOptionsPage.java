package com.omayo.rightpageobject;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;

public class SelectMultipleOptionsPage {
	  

	public WebDriver driver;
	Action action = new Action();

	@FindBy(xpath = "//input[@name='accessories']")
	private List<WebElement> multipleOptions;

	public SelectMultipleOptionsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectMultipleOptions() throws InterruptedException {
		Thread.sleep(3000);
		for (WebElement ele : multipleOptions) {
			if (ele.isSelected() == false) {
				ele.click();
				Thread.sleep(2000);
			}
		}
		Thread.sleep(2000);
		
	}
}
