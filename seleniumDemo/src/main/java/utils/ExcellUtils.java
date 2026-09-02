package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcellUtils {

	@DataProvider(name = "loginData")
	public static String getExcellData(String sheetName, int rowNumber, int colNumber) throws IOException {

		String filePath = "C:\\Users\\purus\\git\\repository\\seleniumDemo\\src\\test\\resources\\TestData.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		Workbook workbook = WorkbookFactory.create(fis);

		Sheet sheet = workbook.getSheet("Sheet2");

		String data = sheet.getRow(rowNumber).getCell(colNumber).getStringCellValue();

		workbook.close();
		fis.close();
		return data;
	}
}
