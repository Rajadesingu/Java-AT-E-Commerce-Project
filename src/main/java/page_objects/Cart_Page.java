package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base_class.Base_Class;

public class Cart_Page extends Base_Class {
	public Cart_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement checkOut() {
		WebElement check_Out = driver.findElement(By.xpath("// button[text()='Checkout']"));
		return check_Out;
	}

}
