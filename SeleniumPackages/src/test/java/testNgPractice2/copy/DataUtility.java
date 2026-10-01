package testNgPractice2.copy;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataUtility {

    @DataProvider(indices = {0,1},parallel = !true)
      public String[][] getExcelData(){
    	  String path =  "data/createLead.xlsx";
    	  XSSFWorkbook book = null;
    	  
    	 try {
			book = new XSSFWorkbook(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	XSSFSheet sheet = book.getSheetAt(0);
    	int lastRowNum = sheet.getLastRowNum();
    	int lastCellNum = sheet.getRow(0).getLastCellNum();
    	String[][] data = new String[lastRowNum][lastCellNum];
    	
    	for (int i = 1; i <=lastRowNum; i++) {
    		XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft = new DataFormatter();
				String formatCellValue = dft.formatCellValue(cell);
				data[i-1][j] = formatCellValue;
				
//				for (int i = 1; i <= rowCount; i++) { //traverse through the row
//				for(int j = 0; j < cellCount; j++) { //0,1,2
//					String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
//					data[i-1][j] = cellValue;
			}
		}
    	return data;
    }

}
