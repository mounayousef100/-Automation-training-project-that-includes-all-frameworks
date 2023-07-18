package com.omayo.rightpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omayo.actiondriver.Action;

public class SelectVehiclePage {
	public WebDriver driver;
	Action action = new Action();

	@FindBy( xpath = "//input[@value='Car']")
	private WebElement redioButtonCar;


	public SelectVehiclePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectVehicle () throws InterruptedException {
		Thread.sleep(3000);
	    action.click(driver,redioButtonCar);
		Thread.sleep(3000);

	}
}
