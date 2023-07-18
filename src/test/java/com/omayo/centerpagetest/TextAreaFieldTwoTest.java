package com.omayo.centerpagetest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.omayo.base.Base;
import com.omayo.centerpageobject.TextAreaFieldTwoPage;

public class TextAreaFieldTwoTest extends Base {
	private TextAreaFieldTwoPage textAreaFieldTwoPage;
	@BeforeClass
	public void openPage() throws IOException {
		driver = intializEDriver();
		driver.get(prop.getProperty("url"));
	}

	@AfterClass
	public void clouser() {
		driver.quit();
	}

	@Test()
	public void textAreaFieldTwoTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		textAreaFieldTwoPage = new TextAreaFieldTwoPage(driver);
		textAreaFieldTwoPage.textAreField();
		
	}
}
