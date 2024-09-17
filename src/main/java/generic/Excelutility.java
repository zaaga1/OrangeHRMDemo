package generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility {
	public String readDataFromExcel(String sheetName,int rowNum,int cellNum) throws Exception
	{
		FileInputStream fis = new FileInputStream(IConstantUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Cell c = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
		DataFormatter df = new DataFormatter(); 
		String value = df.formatCellValue(c);
		return value;
	}

}
