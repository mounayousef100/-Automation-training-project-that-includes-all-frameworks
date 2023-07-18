package com.omayo.leftpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;

public class UploadFilePage {
	public WebDriver driver;
	Action action = new Action();

	@FindBy( id = "uploadfile")
	private  WebElement uploadfile;

	public UploadFilePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void uploadFile() throws InterruptedException {
		Thread.sleep(3000);
		String projectPath = System.getProperty("user.dir");
		action.typestring(uploadfile,projectPath+ "\\File\\Photos.png");
        //action.typestring(uploadfile,"C:\\Users\\Abdallah\\Downloads\\Photos.png");
		Thread.sleep(4000);
}
}
