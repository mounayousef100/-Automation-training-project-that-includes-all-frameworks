package com.omayo.rightpageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;

public class OtherSitestoPracticeAutomationPage {
	public WebDriver driver;
	Action action = new Action();

	@FindBy(xpath = "//div[@class ='widget-content']/ul/li/a")
	private  List<WebElement> clickOtherSites;


	public OtherSitestoPracticeAutomationPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void hiddenButton() throws InterruptedException {
		Thread.sleep(4000);
		for (WebElement element : clickOtherSites) {
             element.click();
             Thread.sleep(4000);
             driver.navigate().back();
             Thread.sleep(4000);
             
        }
		Thread.sleep(3000);

	}
}
