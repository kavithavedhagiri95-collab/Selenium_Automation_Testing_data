package testNgPractice;

import org.testng.annotations.DataProvider;

public class DataUtility {

	@DataProvider(name = "loginData")
	
//	@DataProvider(/* indices = {1, 2}, */ parallel = !true)
	
		public Object[][] getData() throws Exception{
//			return new Object[][] {
//				{"Hari","R"},
//				{"Devesh","M"},
//				{"Kavitha","V"},
//			};
//		  String path = "data/createLead.xlsx";
//		  return ExcelUtils.getExcelData(path, "Sheet1");
		return DataUtil.getExcelData();
	}
	}

