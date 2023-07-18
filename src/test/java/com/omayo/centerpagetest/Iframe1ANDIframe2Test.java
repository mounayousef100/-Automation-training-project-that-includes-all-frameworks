package com.omayo.centerpagetest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.omayo.base.Base;
import com.omayo.centerpageobject.Iframe1ANDIframe2Page;


public class Iframe1ANDIframe2Test extends Base{
	private Iframe1ANDIframe2Page iframe1ANDIframe2Page;

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
	public void iframe1ANDIframe2Test() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		iframe1ANDIframe2Page = new Iframe1ANDIframe2Page(driver);
		// The values "username" and "password" are arguments 
		iframe1ANDIframe2Page.iframe1ANDIframe2();
	}
}
