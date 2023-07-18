package com.omayo.dataprovider;
import org.testng.annotations.DataProvider;
import com.omayo.utility.ExcelUtils;

public class ExcelDataProvider {
	ExcelUtils obj = new ExcelUtils();
	
	@DataProvider(name = "LocateUsingNameAttributePage")
	public Object[][] LocateUsingNameAttributePage() {
		int rows = obj.getRowCount("LocateUsingNameAttributePage");
		int column = obj.getColumnCount("LocateUsingNameAttributePage");
		int actRows = rows - 1;
		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("LocateUsingNameAttributePage", j, i + 2);
			}
		}
		return data;
	}
	
	
}
