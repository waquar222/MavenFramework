package com.autotest.crm.genericlib;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/*
 * 
 * @author waqua
 *
 */
public class FileUtils {
/**
 * To Fetch data from Properties file
 * @param Key
 * @return
 * @throws Exception
 */
	public String getPropertyData(String Key) throws Exception
	{
		FileInputStream file = new FileInputStream("./src/test/resource/VtigerLogin.properties");
		Properties pobj = new Properties();
		pobj.load(file);
		String value = pobj.getProperty(Key);
		return value;
	}
	/*
	 * To Fetch data from Excel sheet
	 */
	public String getExcelData(String Sheet,int row,int cell) throws Exception
	{
		FileInputStream file = new FileInputStream("./src/test/resource/TestscriptsData.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		String data = wb.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	public static void copyFile(File src, File dst) {
		// TODO Auto-generated method stub
		
	}
		
}
