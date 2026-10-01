package testNgPractice;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static Object[][] getExcelData(String path, String sheetName)
            throws Exception {
		        FileInputStream file = new FileInputStream(path);
		        XSSFWorkbook book = new XSSFWorkbook(file);
		        XSSFSheet sheet = book.getSheet(sheetName);
		        int rowCount = sheet.getLastRowNum();
		        int columCount = sheet.getRow(0).getLastCellNum();
		        
		        Object[][] data = new Object[rowCount][columCount];
		        for (int i = 1; i <=rowCount;i++) {
					 for (int j = 0; j < columCount; j++) {
						data[i-1][j] =  sheet.getRow(i).getCell(j).toString();
					}
				}
		        book.close();	
				return data;

	}
}
