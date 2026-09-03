package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example {

	public static void main(String[] args) throws IOException {

		String filePath = "C:\\TestData\\TestData.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		Workbook workbook = WorkbookFactory.create(fis);

		Sheet sheet = workbook.getSheet("sheet1");
	
		{

			for (Row row : sheet) {

				for (Cell cell : row) {

					System.out.println(cell.toString() + " | ");
				}

				System.out.println();
			}

			workbook.close();
			fis.close();

		}
	}
}


