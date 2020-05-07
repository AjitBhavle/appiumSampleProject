package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import objectRepoPackage.LoginPageObjects;

public class ReadExcelData extends LoginPageObjects {
	
	//Main function is calling readExcel function to read data from excel file
	 @DataProvider(name="Login")
		public static String[][] loginData() throws IOException {
			String[][] arrayObject = readExcel("D:\\Users\\ABhavle\\eclipse-workspace\\appiumSampleProject\\src\\test\\java\\readExcelData\\UserPass.xlsx","Sheet1");

			return arrayObject;
		}
	    
	    public static String[][] readExcel(String filePath,String sheetName) throws IOException{

		    //Create an object of File class to open xlsx file
		    String[][] getData=null;
		    File file = new File(filePath);

		    //Create an object of FileInputStream class to read excel file

		    FileInputStream inputStream = new FileInputStream(file);

		    Workbook workbook = null;

		    //Find the file extension by splitting file name in substring  and getting only extension name

		    String fileExtensionName = filePath.substring(filePath.indexOf("."));

		    //Check condition if the file is xlsx file

		    if(fileExtensionName.equals(".xlsx")){

		    //If it is xlsx file then create object of XSSFWorkbook class

		    workbook = new XSSFWorkbook(inputStream);

		    }

		    //Check condition if the file is xls file

		    else if(fileExtensionName.equals(".xls")){

		        //If it is xls file then create object of HSSFWorkbook class

		         workbook = new HSSFWorkbook(inputStream);
		       

		    }

		    //Read sheet inside the workbook by its name

		    Sheet sheet = workbook.getSheet(sheetName);
	        Row row = sheet.getRow(0);
		    
		    int rowCount = sheet.getLastRowNum();
		    //int RowNum = guru99Sheet.getPhysicalNumberOfRows();// count my number of Rows
		    int ColCount=row.getPhysicalNumberOfCells();

		    //Create a loop over all the rows of excel file to read it
		   // System.out.print(rowCount+1+" "+ColCount);
		    
		    getData =new String[rowCount+1][ColCount];   
		    for (int i = 0; i < rowCount+1; i++) {

		        Row row1 = sheet.getRow(i);

		        //Create a loop to print cell values in a row

		        for (int j = 0; j < ColCount; j++) {

		            //Print Excel data in console
		        	getData[i][j]=row1.getCell(j).getStringCellValue();
					System.out.println(getData[i][j]);

		            //System.out.print(row1.getCell(j).getStringCellValue()+"|| ");

		        }

		    }
		    return getData; 

		    }  
	
}
