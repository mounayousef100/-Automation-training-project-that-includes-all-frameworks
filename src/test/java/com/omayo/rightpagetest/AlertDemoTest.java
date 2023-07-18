package com.omayo.rightpagetest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.omayo.base.Base;
import com.omayo.rightpageobject.AlertDemoPage;

public class AlertDemoTest extends Base{
	private AlertDemoPage alertDemoPage;
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
	public void alertDemoTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		alertDemoPage = new AlertDemoPage(driver);
		alertDemoPage.clickToGetAlert();
	
		
	}
}
