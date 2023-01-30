package dataBase;

	import java.io.File;
import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import pages.BaseClass;

	public class DataBase extends BaseClass {
		
		public void data(AndroidDriver driver) {
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			XSSFWorkbook wb;
			XSSFSheet sheet;
			//FileInputStream fis;
			FileInputStream fis = new FileInputStream(file);
			File src =new FileInputStream("C:\\data\\Untitled spreadsheet");
			
			fis = new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet=wb.getSheetAt(0); 
			
			
			
			
			Properties property = new Properties();
			property.load(fis);
			
			String emailid = property.getProperty("emailid");
			String password = property.getProperty("password");
		
			
		
			
			driver.findElement(By.id("emailid")).sendKeys(emailid);
			WebElement passTxtFld= driver.findElement(By.name("pwd"));
			passTxtFld.sendKeys(password);
			passTxtFld.sendKeys(Keys.ENTER);
			
		
		}
	}
