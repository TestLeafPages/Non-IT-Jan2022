package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Step:1 Connect the path with this method
		XSSFWorkbook wb = new XSSFWorkbook("./exceldata/sampledata.xlsx");

		// wb.getSheetAt(0)
		XSSFSheet sheet = wb.getSheet("Sheet1");

		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Row Count" + lastRowNum);

		XSSFRow row = sheet.getRow(1);
		int lastCellNum = row.getLastCellNum();

		System.out.println("Column Count" + lastCellNum);
		XSSFCell cell = row.getCell(1);

		for (int i = 0; i <= lastRowNum; i++) {
		//	XSSFRow cell2 = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				/*
				 * XSSFCell cell3 = cell2.getCell(j); String cellValue =
				 * cell3.getStringCellValue(); System.out.println(cellValue);
				 */
				
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				
			}
			/*
			 * String stringCellValue = cell.getStringCellValue();
			 * 
			 * System.out.println(stringCellValue);
			 */

			// Wb-->WS-->rc-->col-->cell value
		}

	}

}
