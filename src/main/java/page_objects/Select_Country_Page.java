package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base_class.Base_Class;

public class Select_Country_Page extends Base_Class {

	public Select_Country_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement select_Country() {
		WebElement countrySelection = driver.findElement(By.xpath("(//h4[text()='United States'])[1]"));
		return countrySelection;
	}

}
