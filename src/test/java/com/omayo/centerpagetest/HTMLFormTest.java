package com.omayo.centerpagetest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.omayo.base.Base;
import com.omayo.centerpageobject.HTMLFormPage;


public class HTMLFormTest extends Base {
	private HTMLFormPage hTMLFormPage;

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
	public void hTMLFormTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		hTMLFormPage = new HTMLFormPage(driver);
		// The values "username" and "password" are arguments
		hTMLFormPage.HTMLForm(prop.getProperty("username"), prop.getProperty("password"));
	}
}
