package testNgPractice;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataUtil {
	
	@DataProvider
	public static String[][] getExcelData() {
		String path = "data/createLead.xlsx";
		XSSFWorkbook book = null;
		try {
			book = new XSSFWorkbook(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
		XSSFSheet sheet = book.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Inclusive of header Row" + physicalNumberOfRows);
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[lastRowNum][lastCellNum];
		
		for (int i = 1; i <=lastRowNum; i++) {
			   XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dt = new DataFormatter();
				String value = dt.formatCellValue(cell);
//				String value = cell.getStringCellValue();
//				System.out.println(value);
				data[i-1][j] = value;
			}
		}
		
		try {
			book.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}

}
