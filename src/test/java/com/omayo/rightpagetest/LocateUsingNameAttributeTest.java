package com.omayo.rightpagetest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.omayo.base.Base;
import com.omayo.dataprovider.ExcelDataProvider;
import com.omayo.rightpageobject.LocateUsingNameAttributePage;

public class LocateUsingNameAttributeTest extends Base{
	private LocateUsingNameAttributePage locateUsingNameAttributePage;
	
	@BeforeClass
	public void openPage() throws IOException {
		driver = intializEDriver();
		driver.get(prop.getProperty("url"));
	}

	@AfterClass
	public void clouser() {
		driver.quit();
	}

	@Test(dataProvider = "LocateUsingNameAttributePage", dataProviderClass =ExcelDataProvider.class) 
	public void locateUsingNameAttributeTest(String textQA) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		locateUsingNameAttributePage = new LocateUsingNameAttributePage(driver);
		locateUsingNameAttributePage.locateUsingNameAttribute(textQA);
		
	}
}
