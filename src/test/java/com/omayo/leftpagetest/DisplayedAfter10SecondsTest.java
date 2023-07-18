package com.omayo.leftpagetest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.omayo.base.Base;
import com.omayo.leftpageobject.DisplayedAfter10SecondsPage;


public class DisplayedAfter10SecondsTest extends Base{
	private DisplayedAfter10SecondsPage displayedAfter10SecondsPage ;

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
	public void displayedAfter10SecondsTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		displayedAfter10SecondsPage  = new DisplayedAfter10SecondsPage(driver);
		displayedAfter10SecondsPage.displayedAfter10Seconds();
	}
}
