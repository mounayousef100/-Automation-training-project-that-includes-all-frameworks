package com.omayo.leftpagetest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.omayo.base.Base;
import com.omayo.leftpageobject.TextBoxWithPreloadedTextPage;


public class TextBoxWithPreloadedTextTest extends Base {
	private TextBoxWithPreloadedTextPage textBoxWithPreloadedTextPage;

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
	public void textBoxWithPreloadedTextTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		textBoxWithPreloadedTextPage = new TextBoxWithPreloadedTextPage(driver);
		// The values "username" and "password" are arguments
		textBoxWithPreloadedTextPage.TextBoxWithPreloaded();
	}
}
