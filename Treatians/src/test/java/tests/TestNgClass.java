package tests;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hpsf.HPSFException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dataBase.ExcelSheetDriver;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Allure;
import jxl.read.biff.BiffException;
import listners.CustomListner;
import pages.BaseClass;
import pages.Installation;
import pages.login;
import pages.signUp;
import pages.BookAppointment;
import pages.HomePage;

@Listeners(CustomListner.class)

public class TestNgClass extends BaseClass{

@Test
public void install_app(){
	
	Installation obj = new Installation(driver);
	obj.install();
	
	}
@Test
public void LoginApp() throws BiffException, IOException{

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	login lo=new login(driver);
	ExcelSheetDriver excel = new ExcelSheetDriver("C:\\data\\datafile1.xls");
	lo.logIn(ExcelSheetDriver.ReadCell(excel.GetCell("email"),1), ExcelSheetDriver.ReadCell(excel.GetCell("password"), 1));
}

@Test
public void SignUP() throws InterruptedException, BiffException, IOException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	ExcelSheetDriver excel = new ExcelSheetDriver("C:\\data\\datafile1.xls");
	int j=excel.RowCount();
	for(int i=1; i<=j; i++) {
	signUp su=new signUp(driver);
	su.signup(ExcelSheetDriver.ReadCell(excel.GetCell("email"),i), ExcelSheetDriver.ReadCell(excel.GetCell("password"),i));	
}
}

@Test
public void BookAppointment() throws BiffException, IOException{
	LoginApp();
	BookAppointment ba= new BookAppointment(driver);
	ba.Book_Appointment();
}
@Test
public void SignUpVerification() throws InterruptedException, BiffException, IOException {
	
	SignUP();
	signUp su=new signUp(driver);
	su.BackArrow.click();
	Thread.sleep(2000);
	LoginApp();	
}

@Test
public void Booking2DrAtSameTimeslot() {
	
	BookAppointment ba= new BookAppointment(driver);
	ba.Book_Appointment();
	ba.threebar2.click();
	ba.Home.click();
	ba.Book_Appointment2();
	
}
@Test
public void MultipleLogin() throws BiffException, IOException, InterruptedException {

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	ExcelSheetDriver excel = new ExcelSheetDriver("C:\\data\\datafile1.xls");
	int j=excel.RowCount();
	for(int i=1; i<=j; i++)
	{	
		Thread.sleep(2000);
		login lo=new login(driver);
		lo.logIn(ExcelSheetDriver.ReadCell(excel.GetCell("email"),i), ExcelSheetDriver.ReadCell(excel.GetCell("password"), i));
		Thread.sleep(2000);
		HomePage hp=new HomePage(driver);
		hp.threebar.click();
		lo.logout.click();
	}
}

}