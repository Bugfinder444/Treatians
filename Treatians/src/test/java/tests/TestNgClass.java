package tests;

import java.time.Duration;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.qameta.allure.Allure;
import listners.CustomListner;
import pages.BaseClass;
import pages.Installation;
import pages.login;
import pages.signUp;
import pages.BookAppointment;

@Listeners(CustomListner.class)

public class TestNgClass extends BaseClass{

@Test
public void install_app(){
	
	Installation obj = new Installation(driver);
	obj.install();
	
	}
@Test
public void LoginApp() {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	login lo=new login(driver);
	lo.logIn();
}

@Test
public void SignUP() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	signUp su=new signUp(driver);
	su.signup();	
}

@Test
public void BookAppointment() {
	LoginApp();
	BookAppointment ba= new BookAppointment(driver);
	ba.Book_Appointment();
}
}