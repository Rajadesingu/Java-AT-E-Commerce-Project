package configuration_manager;

import org.openqa.selenium.WebDriver;

import base_class.Base_Class;
import page_objects.Cart_Page;
import page_objects.Checkout_Page;
import page_objects.Home_Page;
import page_objects.Select_Country_Page;
import page_objects.Sign_In_Page;
import page_objects.Sign_Up_Page;

public class Page_Object_Manager extends Base_Class {
	public WebDriver driver;

	private Sign_Up_Page sup;
	private Select_Country_Page scp;
	private Sign_In_Page sip;
	private Home_Page hp;
	private Cart_Page cp;
	private Checkout_Page cop;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;

	}

	public Sign_Up_Page get_Instance_SUP() {
		sup = new Sign_Up_Page(driver);
		return sup;

	}

	public Select_Country_Page get_Instance_SCP() {
		scp = new Select_Country_Page(driver);
		return scp;
	}

	public Sign_In_Page get_Instance_SIP() {
		sip = new Sign_In_Page(driver);
		return sip;
	}

	public Home_Page get_Instance_HP() {
		hp = new Home_Page(driver);
		return hp;
	}

	public Cart_Page get_Instace_CP() {
		cp = new Cart_Page(driver);
		return cp;
	}

	public Checkout_Page get_Instance_COP() {
		cop = new Checkout_Page(driver);
		return cop;

	}
}
