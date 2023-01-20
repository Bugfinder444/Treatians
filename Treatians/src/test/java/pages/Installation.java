package pages;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Installation extends BaseClass{
	
	public Installation(AndroidDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}
	
	public void install() {
		
		driver.installApp("C:\\apks\\app-dev-jan-17.apk");
	}
}
