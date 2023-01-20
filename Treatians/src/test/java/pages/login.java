package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class login extends BaseClass {
	
public login(AndroidDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}
@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")
public WebElement threebar;

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.EditText")
public WebElement emailTextFeild;

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText")
public WebElement passwordTextFeild;

//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View[2]")
//public WebElement clickpasswordTextFeild;

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")
public WebElement signinButton;

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.Image")
public WebElement showPassword;

@AndroidFindBy(xpath= "//android.view.View[@content-desc=\"Create new user\"]/android.widget.TextView")
public WebElement createNewUser;

@AndroidFindBy(xpath= "//android.view.View[@content-desc=\"Forgot password\"]/android.widget.TextView")
public WebElement forgotPassword;

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")
public WebElement backArrow;

@AndroidFindBy(xpath= "//android.view.View[@content-desc=\"person circle Log in\"]/android.view.View[1]")
public WebElement clickLoginButton;

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View[8]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.TextView")
public WebElement logout;



public void logIn() {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	threebar.click();
	clickLoginButton.click();
	emailTextFeild.click();
	emailTextFeild.sendKeys("simbasingh@gmail.com");
	passwordTextFeild.click();
	passwordTextFeild.sendKeys("123456789");
	signinButton.click();
	}
public void logout() {
	
	threebar.click();
	logout.click();
	
	}
}
