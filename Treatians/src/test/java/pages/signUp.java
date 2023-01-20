package pages;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class signUp extends BaseClass {
	
public signUp(AndroidDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.EditText")
public WebElement firstNameTextFeild;

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.EditText")
public WebElement lastNameTextFeild;

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.EditText")
public WebElement emailTextFeild;

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[4]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.EditText")
public WebElement phoneTextFeild;

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[5]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.EditText")
public WebElement passwordTextFeild;

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[6]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.EditText")
public WebElement confirmPasswordTextFeild;

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[4]/android.view.View/android.view.View[1]/android.view.View/android.widget.Spinner/android.view.View[1]")
public WebElement SelectCountryDropDown;

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View/android.view.View[1]/android.widget.Button[2]")
public WebElement india;

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[8]/android.view.View/android.view.View[1]/android.view.View/android.widget.Spinner")
public WebElement SelectCityDropDown;

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View/android.view.View[1]/android.widget.Button[12]")
public WebElement noida;

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[6]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.EditText")
public WebElement AddressTextFeild;

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[7]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")
public WebElement RegisterButton;

@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")
public WebElement BackArrow;

public void signup() throws InterruptedException{
	
	HomePage hp = new HomePage(driver);
	hp.openLogin();
	login li= new login(driver);
	li.createNewUser.click();
	firstNameTextFeild.click();
	firstNameTextFeild.sendKeys("Appium");
	lastNameTextFeild.click();
	lastNameTextFeild.sendKeys("Test1");
	emailTextFeild.click();
	emailTextFeild.sendKeys("appiumtest1@gmail.com");
	phoneTextFeild.click();
	phoneTextFeild.sendKeys("1111111111");
	passwordTextFeild.click();
	passwordTextFeild.sendKeys("123456789");
	confirmPasswordTextFeild.click();
	confirmPasswordTextFeild.sendKeys("123456789");
	
	PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
	Sequence scrolla = new Sequence(finger1, 1);
	scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
	PointerInput.Origin.viewport(), 476, 1424));
	scrolla.addAction(finger1.createPointerDown(0));
	scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(100),
	PointerInput.Origin.viewport(),476, 123));
	scrolla.addAction(finger1.createPointerUp(0));
	driver.perform(Arrays.asList(scrolla));
	
	Thread.sleep(2000);
	SelectCountryDropDown.click();
	india.click();
	Thread.sleep(3000);
	SelectCityDropDown.click();
	Thread.sleep(2000);
	noida.click();
	AddressTextFeild.click();
	Thread.sleep(1000);
	AddressTextFeild.sendKeys("Fleek IT Solutions");
	RegisterButton.click();
	
	
}
/*
@AndroidFindBy(xpath= "")
public WebElement ;*/


}
