package pages;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.qameta.allure.Allure;

public class BaseClass {
	
	public static AndroidDriver driver;
	@BeforeTest
	public void setup() throws MalformedURLException{
			
			
			DesiredCapabilities caps= new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");	
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
			caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			caps.setCapability("appPackage", "com.treatians");
			caps.setCapability("appActivity", "com.treatians.MainActivity");
			
			//caps.setCapability(MobileCapabilityType.APP, "C:\\apks\\app-dev-jan-17.apk");
			
			URL url=new URL("http://127.0.0.1:4723/wd/hub");
			
			driver = new AndroidDriver(url,caps);
		}
			
			public void failed(String testMethodName, AndroidDriver driver) throws IOException {
				BaseClass.driver=driver;
				Date d=new Date();
				SimpleDateFormat sdf=new SimpleDateFormat("MM/DD/Y HH:mm:ss");
				String date=sdf.format(d);
				date=date.replace(':', '_');
		    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Fleek\\eclipse-workspace\\AppInstall\\ScreenShots\\"+testMethodName+"_"+date+".jpg"));
			Allure.attachment("Screenshot", new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));		
	}
}

