package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base_class.Base_Class;

public class Sign_In_Page extends Base_Class {

	public Sign_In_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement usersignIn() {
		WebElement clickSignIn = driver.findElement(By.xpath("//a[text()='Sign In']"));
		return clickSignIn;
	}

	public WebElement mailId() {
		WebElement emailId = driver.findElement(By.xpath("//label[text()='Email Address']"));
		return emailId;

	}

	public WebElement passWord() {
		WebElement pass_Word = driver.findElement(By.xpath("//label[text()='Password']"));
		return pass_Word;
	}

	public WebElement submitSignin() {
		WebElement submit_Signin = driver.findElement(By.xpath("//button[text()='Sign In']"));
		return submit_Signin;
	}

	public WebElement continueAsGuest() {
		WebElement continue_AsGuest = driver.findElement(By.xpath("//button[text()='Continue as Guest']"));
		return continue_AsGuest;
	}
}