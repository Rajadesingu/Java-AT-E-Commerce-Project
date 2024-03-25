package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base_class.Base_Class;

public class Sign_Up_Page extends Base_Class {

	public Sign_Up_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement account() {
		WebElement clickAccount = driver.findElement(By.xpath("//span[text()='Account']"));
		return clickAccount;
	}

	public WebElement createAccount() {

		WebElement accountCreate = driver.findElement(By.xpath("//a[text()='Create Account']"));
		return accountCreate;
	}

	public WebElement firstName() {

		WebElement first_Name = driver.findElement(By.id("firstName"));
		return first_Name;
	}

	public WebElement lastName() {
		WebElement last_Name = driver.findElement(By.id("lastName"));
		return last_Name;
	}

	public WebElement email() {
		WebElement email_Id = driver.findElement(By.id("email"));
		return email_Id;
	}

	public WebElement password() {
		WebElement pass_word = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		return pass_word;

	}

	public WebElement confirmPassword() {
		WebElement confirm_Password = driver.findElement(By.id("reenterPassword"));
		return confirm_Password;

	}

	public WebElement mobileNumber() {
		WebElement mobile_Number = driver.findElement(By.id("phone"));
		return mobile_Number;

	}

	public WebElement submit() {
		WebElement click_submit = driver.findElement(By.xpath("//button[@type='submit']"));
		return click_submit;

	}
}
