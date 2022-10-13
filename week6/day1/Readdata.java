package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readdata {

	@Test

	public  void Readxldata() throws IOException {


		XSSFWorkbook workbk=new XSSFWorkbook("data/Createlead.xlsx");
		XSSFSheet sheet= workbk.getSheetAt(0);
		int rcount=sheet.getLastRowNum();
		short ccount=sheet.getRow(0).getLastCellNum();


		System.out.println("Row number is"+ rcount);
		System.out.println("column count is"+ccount);

		//XSSFRow Firstdata=sheet.getRow(1);
		//XSSFCell companyName=Firstdata.getCell(2);
		//System.out.println(companyName.getStringCellValue());



		for (int i = 1; i <=rcount; i++) {
			XSSFRow r1 = sheet.getRow(i);
			for (int j = 0; j <ccount; j++) {
				XSSFCell cell=r1.getCell(j);
				System.out.println(cell.getStringCellValue());

			}
		}					

		workbk.close();
	}

}


