package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	FileInputStream fis;
	File f;
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	public ReadExcelFile() {
		try {
			f= new File("src\\test\\resources\\TestData\\ReadExcel.xlsx");
			fis = new FileInputStream(f);
			wb = new XSSFWorkbook(fis);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public String getData(int sheetno ,int row, int col)
	{		
		sh= wb.getSheetAt(sheetno);
		String value= sh.getRow(row).getCell(col).getStringCellValue();
		return value;
	}
	public int getRowCount(int sheetno) {
		sh = wb.getSheetAt(sheetno);
		int row = sh.getLastRowNum();
		return row;
	}
	public short getColumnCount(int sheetno) {
		sh= wb.getSheetAt(sheetno);
		short col= sh.getRow(2).getLastCellNum();
		return col;	
	}
}
