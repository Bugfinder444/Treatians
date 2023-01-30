package dataBase;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelSheetDriver {
	static Sheet wrksheet;
	static Workbook wrkbook =null;
	@SuppressWarnings("rawtypes")
	static Hashtable dict=new Hashtable();
	
	public ExcelSheetDriver(AndroidDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}

	public ExcelSheetDriver(String ExcelSheetPath) throws BiffException, IOException
	{
		wrkbook = Workbook.getWorkbook(new File(ExcelSheetPath));
		wrksheet = wrkbook.getSheet("Sheet1");
		ColumnDictionary();
	}
	
	public int RowCount()
	{
		
		return wrksheet.getRows();
		
	}
	 
	public static String ReadCell(int column,int row)
	{
		
		return wrksheet.getCell(column,row).getContents();
	}
 
	public void ColumnDictionary(){
		
		for(int col=0; col < wrksheet.getColumns(); col++)
		{
			
			dict.put(ReadCell(col, 0), col);
		}
	}
	public static int GetCell(String colName){

	try {
		int value;
		value =((Integer) dict.get(colName)).intValue();
		return value;
	}
	catch (NullPointerException e) {
		return(0);
	}
}
}

