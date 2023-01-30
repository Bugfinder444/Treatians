package pages;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BookAppointment extends HomePage {

	public BookAppointment(AndroidDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
	}
	
	public void Book_Appointment() {
		
		Doctor1.click();
		BookAppointmentButtonInitial.click();
		date.click();
		
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		Sequence scrolla = new Sequence(finger1, 1);
		scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
		PointerInput.Origin.viewport(),512, 2044));
		scrolla.addAction(finger1.createPointerDown(0));
		scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(100),
		PointerInput.Origin.viewport(),512, 632));
		scrolla.addAction(finger1.createPointerUp(0));
		driver.perform(Arrays.asList(scrolla));
		
		timeslot.click();
		BookAppointmentButtonFinal.click();	
	}
	public void Book_Appointment2() {
		Doctor2.click();
		BookAppointmentButtonInitial.click();
		date.click();
		
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		Sequence scrolla = new Sequence(finger1, 1);
		scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
		PointerInput.Origin.viewport(), 512, 2044));
		scrolla.addAction(finger1.createPointerDown(0));
		scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(100),
		PointerInput.Origin.viewport(),512, 632));
		scrolla.addAction(finger1.createPointerUp(0));
		driver.perform(Arrays.asList(scrolla));
		
		timeslot.click();
		BookAppointmentButtonFinal.click();
	}
}
