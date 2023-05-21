package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//read data from IPL excel Sheet
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx"); //provide path of excel file
		
		Workbook wb = WorkbookFactory.create(fis);//make the file ready foe read
		
		Sheet sheet = wb.getSheet("IPL");//get into the sheet
		
		Row row = sheet.getRow(2);//get into desired row
		
		Cell cell = row.getCell(1);//get into desired col/cell
		
		String data = cell.getStringCellValue();//read the value from cell
		
        System.out.println(data);
		
		

	}

}
