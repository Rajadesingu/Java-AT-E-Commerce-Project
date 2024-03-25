package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base_class.Base_Class;

public class Checkout_Page extends Base_Class {
	public Checkout_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement contactInfoEmailId() {
		WebElement contactInfo_EmailId = driver.findElement(By.id("user.emailAddress"));
		return contactInfo_EmailId;
	}

	public WebElement contactInfoMobileNumber() {
		WebElement contactInfo_MobileNumber = driver.findElement(By.id("user.phone"));
		return contactInfo_MobileNumber;
	}

	public WebElement continueToPaymentInformation() {
		WebElement continueToPayment_Information = driver
				.findElement(By.xpath("//span[text()='Continue to Payment Information']"));
		return continueToPayment_Information;
	}

	public WebElement creditCardAndDebitCardNumber() {
		WebElement creditCardAndDebitCard_Number = driver.findElement(By.id("number"));
		return creditCardAndDebitCard_Number;
	}

	public WebElement firstNameForBilling() {
		WebElement firstNameFor_Billing = driver.findElement(By.id("first-name"));
		return firstNameFor_Billing;
	}

	public WebElement lastNameForBilling() {
		WebElement lastNameFor_Billing = driver.findElement(By.id("last-name"));
		return lastNameFor_Billing;
	}

	public WebElement cityForBilling() {
		WebElement cityFor_Billing = driver.findElement(By.id("city"));
		return cityFor_Billing;
	}

	public WebElement stateForBilling() {
		WebElement stateFor_Billing = driver.findElement(By.id("state"));
		return stateFor_Billing;
	}

	public WebElement zipcodeForBilling() {
		WebElement zipcodeFor_Billing = driver.findElement(By.id("postalCode"));
		return zipcodeFor_Billing;
	}

	public WebElement addressForBilling() {
		WebElement addressFor_Billing = driver.findElement(By.id("address-input"));
		return addressFor_Billing;
	}

	public WebElement placeYourOrder() {
		WebElement placeYour_Order = driver.findElement(By.xpath("placeYour_Order"));
		return placeYour_Order;
	}
}
