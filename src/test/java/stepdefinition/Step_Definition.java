package stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base_class.Base_Class;
import configuration_manager.Page_Object_Manager;
import io.cucumber.java.en.*;
import io.cucumber.messages.types.Ci;
import runner.Runner;

public class Step_Definition extends Base_Class {

	public static WebDriver driver = Runner.driver;

	Page_Object_Manager pom = new Page_Object_Manager(driver);

	// Sign up Functionality of BestBuy E-commerce Website

	@Given("User select the country")
	public void user_select_the_country() {
		clickOnElement(pom.get_Instance_SCP().select_Country());
		System.out.println("User select the country");
	}

	@When("User click the account")
	public void user_click_the_account() {
		clickOnElement(pom.get_Instance_SUP().account());
		System.out.println("User click the account");

	}

	@And("User click the create an account")
	public void user_click_the_create_an_account() {
		explicitVidibilityOfWait(pom.get_Instance_SUP().createAccount(), 10);
		clickOnElement(pom.get_Instance_SUP().createAccount());
		System.out.println("User click the create an account");
	}

	@And("User enter the firstname (.*)$")
	public void user_enter_the_firstname(String firstName) {
		inputValueElement(pom.get_Instance_SUP().firstName(), firstName);
		System.out.println("User enter the firstname");
	}

	@And("User enter the last name (.*)$")
	public void user_enter_the_last_name(String lastName) {
		inputValueElement(pom.get_Instance_SUP().lastName(), lastName);
		System.out.println("User enter the last name");
	}

	@And("User enter the email address (.*)$")
	public void user_enter_the_email_address(String mailId) {
		inputValueElement(pom.get_Instance_SUP().email(), mailId);
		System.out.println("User enter the email address");
	}

	@And("User enter the password (.*)$")
	public void user_enter_the_password(String password) { // User enter the mobile number
		inputValueElement(pom.get_Instance_SUP().password(), password);
		System.out.println("User enter the password");
	}

	@And("User enter the confirm password (.*)$")
	public void user_enter_the_confirm_password(String confirmPassword) {
		inputValueElement(pom.get_Instance_SUP().confirmPassword(), confirmPassword);
		System.out.println("User enter the confirm password");
	}

	@And("User enter the mobile number (.*)$")
	public void user_enter_the_mobile_number(String mobileNumber) {
		inputValueElement(pom.get_Instance_SUP().mobileNumber(), mobileNumber);
		System.out.println("User enter the mobile number");
	}

	@And("User click the submit")
	public void user_click_the_submit() {
		clickOnElement(pom.get_Instance_SUP().submit());
		System.out.println("User click the submit");
	}

	@Then("User validate the create an account successfully or not (.*)$")
	public void user_validate_the_create_an_account_successfully_or_not(String firstName) throws IOException {
		WebElement accountName = pom.get_Instance_HP().userAccountName();
		String nameAccount = accountName.getText();
		String actualElement = nameAccount;
		String expectedElement = firstName;

		if (expectedElement.equalsIgnoreCase(actualElement)) {
			System.out.println("User account create successfully...! " + "User Name" + actualElement);
		} else {
			System.out.println("User account create not successful...? ");
		}
		getScreenshot(actualElement);

		closeBrowser();
		System.out.println("Browser closed");
	}

	// Sign in Functionality of BestBuy E-commerce Website

	@Given("User select the  country")
	public void user_select_the__country() {
		explicitVidibilityOfWait(pom.get_Instance_SCP().select_Country(), 10);
		clickOnElement(pom.get_Instance_SCP().select_Country());
		System.out.println("User select the country");
	}

	@When("User click the  account")
	public void user_click_the__account() {
		clickOnElement(pom.get_Instance_SUP().account());
		System.out.println("User click the account");

	}

	@And("User click the signin")
	public void user_click_the_signin() {
		clickOnElement(pom.get_Instance_SIP().usersignIn());
	}

	@And("User enter the signin email address (.*)$")
	public void user_enter_the_signin_email_address(String mailId) {
		explicitVidibilityOfWait(pom.get_Instance_SIP().mailId(), 10);
		inputValueElement(pom.get_Instance_SIP().mailId(), mailId);
	}

	@And("User enter the signin password (.*)$")
	public void user_enter_the_signin_password(String password) {
		explicitVidibilityOfWait(pom.get_Instance_SIP().passWord(), 10);
		inputValueElement(pom.get_Instance_SIP().passWord(), password);
	}

	@And("user click the sign in")
	public void user_click_the_sign_in() {
		clickOnElement(pom.get_Instance_SIP().submitSignin());
	}

	@Then("user validate homePage should be displayed (.*)$")
	public void user_validate_home_page_should_be_displayed(String firstName) throws IOException {
		WebElement accountName = pom.get_Instance_HP().userAccountName();
		String nameAccount = accountName.getText();
		String actualElement = nameAccount;
		String expectedElement = firstName;

		if (expectedElement.equalsIgnoreCase(actualElement)) {
			System.out.println("User sign in successfully...! " + "User Name" + actualElement);
		} else {
			System.out.println("User sign in not successful...? ");
		}
		getScreenshot(actualElement);
		closeBrowser();
		System.out.println("Browser closed");

	}

	// Validate if URL link is broken

	@Given("Launch the URL")
	public void launch_the_url() {
		System.out.println("An URL has been launched");
	}

	@Then("Verify that the link is broken")
	public void verify_that_the_link_is_broken() throws MalformedURLException, IOException {

		// Get the URL of the Best Buy webpage
		String bestBuyURL = driver.getCurrentUrl();

		// Verify if the Best Buy URL is valid
		HttpURLConnection connection = (HttpURLConnection) new URL(bestBuyURL).openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		int responseCode = connection.getResponseCode();
		if (responseCode >= 400) {
			System.out.println("The Best Buy link is broken. Response code: " + responseCode);
		} else {
			System.out.println("The Best Buy link is valid. Response code: " + responseCode);
		}
		connection.disconnect();
		closeBrowser();
		System.out.println("Browser closed");
	}

// Navigation and title validation on Best Buy website

	@Given("Launch the URL link")
	public void launch_the_url_link() {
		System.out.println("An URL has been launched");
	}

	@When("Navigate through each menu")
	public void navigate_through_each_menu() {
		clickOnElement(pom.get_Instance_SCP().select_Country());
		System.out.println("Navigated through each menu");
	}

	@Then("Validate the title on each page")
	public void validate_the_title_on_each_page() {
		System.out.println("Navigate to the each link and validate");
	}

	@And("Validate the topdeal menu")
	public void validate_the_topdeal_menu() {
		clickOnElement(pom.get_Instance_HP().topDealLink());
		// get the title page
		String pageTitle = driver.getTitle();
		System.out.println("Title of page: " + pageTitle);

		// Validate the title of the page
		if (pageTitle.equals("Top Deals and Featured Offers on Electronics - Best Buy")) {
			System.out.println("Title validation passed for page.");
		} else {
			System.out.println("Title validation failed for page.");
		}
		backward();

	}

	@And("Validate the dealoftheday menu")
	public void validate_the_dealoftheday_menu() {
		clickOnElement(pom.get_Instance_HP().dealOfTheDayLink());
		// get the title page
		String pageTitle = driver.getTitle();
		System.out.println("Title of page: " + pageTitle);

		// Validate the title of the page
		if (pageTitle.equals("Deal of the Day: Electronics Deals - Best Buy")) {
			System.out.println("Title validation passed for page.");
		} else {
			System.out.println("Title validation failed for page.");
		}
		backward();
	}

	@And("Validate the yesbestbuysellsthat menu")
	public void validate_the_yesbestbuysellsthat_menu() {
		clickOnElement(pom.get_Instance_HP().yesBestBuySellsThatLink());
		// get the title page
		String pageTitle = driver.getTitle();
		System.out.println("Title of page: " + pageTitle);

		// Validate the title of the page
		if (pageTitle.equals("Yes, Best Buy Sells That – Best Buy")) {
			System.out.println("Title validation passed for page.");
		} else {
			System.out.println("Title validation failed for page.");
		}
		backward();
	}

	@And("Validate the mybestbuymemberships menu")
	public void validate_the_mybestbuymemberships_menu() {
		clickOnElement(pom.get_Instance_HP().myBestBuyMembershipsLink());
		// get the title page
		String pageTitle = driver.getTitle();
		System.out.println("Title of page: " + pageTitle);

		// Validate the title of the page
		if (pageTitle.equals("My Best Buy Memberships")) {
			System.out.println("Title validation passed for page.");
		} else {
			System.out.println("Title validation failed for page.");
		}
		backward();

	}

	@And("Validate the creditcard menu")
	public void validate_the_creditcard_menu() {
		clickOnElement(pom.get_Instance_HP().creditCardsLink());
		// get the title page
		String pageTitle = driver.getTitle();
		System.out.println("Title of page: " + pageTitle);

		// Validate the title of the page
		if (pageTitle.equals("Best Buy Credit Card: Rewards & Financing")) {
			System.out.println("Title validation passed for page.");
		} else {
			System.out.println("Title validation failed for page.");
		}
		backward();

	}

	@And("Validate the moregiftcards menu")
	public void validate_the_moregiftcards_menu() {
		clickOnElement(pom.get_Instance_HP().moreLink());
		clickOnElement(pom.get_Instance_HP().giftCardsLink());
		// get the title page
		String pageTitle = driver.getTitle();
		System.out.println("Title of page: " + pageTitle);

		// Validate the title of the page
		if (pageTitle.equals("Gifts Cards and E-Gift Cards - Best Buy")) {
			System.out.println("Title validation passed for page.");
		} else {
			System.out.println("Title validation failed for page.");
		}
		backward();
	}

	@And("Validate the moregiftideas menu")
	public void validate_the_moregiftideas_menu() {
		clickOnElement(pom.get_Instance_HP().moreLink());
		clickOnElement(pom.get_Instance_HP().giftIdeasLink());
		// get the title page
		String pageTitle = driver.getTitle();
		System.out.println("Title of page: " + pageTitle);

		// Validate the title of the page
		if (pageTitle.equals("Gift Ideas 2024: Best Gifts to Give This Year - Best Buy")) {
			System.out.println("Title validation passed for page.");
		} else {
			System.out.println("Title validation failed for page.");
		}
		closeBrowser();
		System.out.println("Brwoser closed");
	}

	// Verify the presence of important bottom links

	@Given("Launch the URL for bottom link")
	public void launch_the_url_for_bottom_link() {
		System.out.println("An URL has been launched");
		clickOnElement(pom.get_Instance_SCP().select_Country());
	}

	@When("Navigate the bottom link")
	public void navigate_the_bottom_link() {
		moveToElement(pom.get_Instance_HP().accessibilityLink());
		System.out.println("Navigated to the bottom link");

	}

	@Then("Validate the accessibility link")
	public void validate_the_accessibility_link() {
		clickOnElement(pom.get_Instance_HP().accessibilityLink());
		// get the title page
		String titleLink = pom.get_Instance_HP().accessibilityTitle().getText();
		System.out.println("Title of text: " + titleLink);

		// Validate the title of the page
		if (titleLink.equals("Accessibility")) {
			System.out.println("Link validation passed for page.");
		} else {
			System.out.println("Link validation failed for page.");
		}
		backward();

	}

	@And("Validate the terms&conditions link")
	public void validate_the_terms_conditions_link() {
		moveToElement(pom.get_Instance_HP().termsAndConditionsLink());
		clickOnElement(pom.get_Instance_HP().termsAndConditionsLink());
		// get the title page
		String titleLink = pom.get_Instance_HP().termsAndConditionsTitle().getText();
		System.out.println("Title of text: " + titleLink);

		// Validate the title of the page
		if (titleLink.equals("Terms and Conditions")) {
			System.out.println("Link validation passed for page.");
		} else {
			System.out.println("Link validation failed for page.");
		}
		backward();
	}

	@And("Validate the privacy link")
	public void validate_the_privacy_link() {
		moveToElement(pom.get_Instance_HP().privacyLink());
		clickOnElement(pom.get_Instance_HP().privacyLink());
		// get the title page
		String titleLink = pom.get_Instance_HP().privacyTitle().getText();
		System.out.println("Title of text: " + titleLink);

		// Validate the title of the page
		if (titleLink.equals("Best Buy Privacy Hub")) {
			System.out.println("Link validation passed for page.");
		} else {
			System.out.println("Link validation failed for page.");
		}
		backward();
	}

	@And("Validate the interestbasedads link")
	public void validate_the_interestbasedads_link() {
		moveToElement(pom.get_Instance_HP().interestBasedAdsLink());
		clickOnElement(pom.get_Instance_HP().interestBasedAdsLink());
		// get the title page
		String titleLink = pom.get_Instance_HP().interestBasedAdsTitle().getText();
		System.out.println("Title of text: " + titleLink);

		// Validate the title of the page
		if (titleLink.equals("Interest-Based Ads")) {
			System.out.println("Link validation passed for page.");
		} else {
			System.out.println("Link validation failed for page.");
		}
	}

	// Search for and add an item to the shopping cart

	@Given("Launch the URL for search")
	public void launch_the_url_for_search() {
		System.out.println("An URL has been launched");
		clickOnElement(pom.get_Instance_SCP().select_Country());
	}

	@When("Navigate the search")
	public void navigate_the_search() {
		clickOnElement(pom.get_Instance_HP().searchBox());
		System.out.println("Navigated the search box");
	}

	@And("Enter the product name and search")
	public void enter_the_product_name_and_search() throws AWTException {
		inputValueElement(pom.get_Instance_HP().searchBox(), "mobile");
		robotClass().keyPress(KeyEvent.VK_ENTER);
		robotClass().keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Enterd product name and search");

	}

	@And("Select the product and add to cart")
	public void select_the_product_and_add_to_cart() {
		moveToElement(pom.get_Instance_HP().someProduct());
		clickOnElement(pom.get_Instance_HP().someProduct());
		moveToElement(pom.get_Instance_HP().clickAddToCartFirst());
		clickOnElement(pom.get_Instance_HP().clickAddToCartFirst());
		clickOnElement(pom.get_Instance_HP().clickAddToCartSecond());
		moveToElement(pom.get_Instance_HP().clickContinue());
		clickOnElement(pom.get_Instance_HP().clickGoToCart());
		System.out.println("Puroduct selected and added to cart");
	}

	@Then("Validate the add on product in shopping cart")
	public void validate_the_add_on_product_in_shopping_cart() {
		String checkOut = pom.get_Instace_CP().checkOut().getText();
		System.out.println("Title of text: " + checkOut);

		// Validate the title of the page
		if (checkOut.equals("Checkout")) {
			System.out.println("Product added to cart successfully.");
		} else {
			System.out.println("Product added to cart not successfully.");
		}

	}

	// selects and adds an item from Shop by Department menu

	@Given("Launch the URL for shop by department")
	public void launch_the_url_for_shop_by_department() {
		System.out.println("An URL has been launched");
		clickOnElement(pom.get_Instance_SCP().select_Country());
	}

	@When("Click the shop by department menu")
	public void click_the_shop_by_department_menu() {
		clickOnElement(pom.get_Instance_HP().menuTop());
		System.out.println("clicked the top menu");

	}

	@And("Select the item from shop by department")
	public void select_the_item_from_shop_by_department() {
		clickOnElement(pom.get_Instance_HP().appliancesDeparment());
		clickOnElement(pom.get_Instance_HP().majorKitchenAppliances());
		clickOnElement(pom.get_Instance_HP().refrigeratorsMenu());
		moveToElement(pom.get_Instance_HP().frenchDoorRefrigerators());
		clickOnElement(pom.get_Instance_HP().frenchDoorRefrigerators());
		moveToElement(pom.get_Instance_HP().clickAddToCartFirst());
		clickOnElement(pom.get_Instance_HP().clickAddToCartFirst());
		System.out.println("Item selected from shop by department");
	}

	@Then("Validate the add on product in shopping cart from shop by department")
	public void validate_the_add_on_product_in_shopping_cart_from_shop_by_department() {
		clickOnElement(pom.get_Instance_HP().clickTopCart());
		String checkOut = pom.get_Instace_CP().checkOut().getText();
		System.out.println("Title of text: " + checkOut);

		// Validate the title of the page
		if (checkOut.equals("Checkout")) {
			System.out.println("Product added to cart successfully.");
		} else {
			System.out.println("Product added to cart not successfully.");
		}

	}

	// Select and add an item from Menu to Brands

	@Given("Launch the URL for brands")
	public void launch_the_url_for_brands() {
		System.out.println("An URL has been launched");
		clickOnElement(pom.get_Instance_SCP().select_Country());
	}

	@When("Navigate the shop by brands menu")
	public void navigate_the_shop_by_brands_menu() {
		clickOnElement(pom.get_Instance_HP().menuTop());
		clickOnElement(pom.get_Instance_HP().brandMenu());
		System.out.println("Navigated the bran menu");
	}

	@When("Select the brand and add on item to cart")
	public void select_the_brand_and_add_on_item_to_cart() {
		clickOnElement(pom.get_Instance_HP().playStationMenu());
		moveToElement(pom.get_Instance_HP().ps5ConsolesMenu());
		clickOnElement(pom.get_Instance_HP().ps5ConsolesMenu());
		moveToElement(pom.get_Instance_HP().clickAddToCartFirst());
		clickOnElement(pom.get_Instance_HP().clickAddToCartFirst());
		System.out.println("Item added to cart");
	}

	@Then("Validate the add on item in shopping cart")
	public void validate_the_add_on_item_in_shopping_cart() {
		clickOnElement(pom.get_Instance_HP().instantGoToCart());
		String checkOut = pom.get_Instace_CP().checkOut().getText();
		System.out.println("Title of text: " + checkOut);

		// Validate the title of the page
		if (checkOut.equals("Checkout")) {
			System.out.println("Product added to cart successfully.");
		} else {
			System.out.println("Product added to cart not successfully.");
		}
	}

	// Navigate to the checkout page and fill out the form with dummy payment
	// information

	@Given("Launch the URL for checkout")
	public void launch_the_url_for_checkout() {
		System.out.println("An URL has been launched");
		clickOnElement(pom.get_Instance_SCP().select_Country());
	}

	@When("Add item to shopping cart")
	public void add_item_to_shopping_cart() {
		clickOnElement(pom.get_Instance_HP().menuTop());
		clickOnElement(pom.get_Instance_HP().brandMenu());
		System.out.println("Navigated the bran menu");
		clickOnElement(pom.get_Instance_HP().playStationMenu());
		moveToElement(pom.get_Instance_HP().ps5ConsolesMenu());
		clickOnElement(pom.get_Instance_HP().ps5ConsolesMenu());
		moveToElement(pom.get_Instance_HP().clickAddToCartFirst());
		clickOnElement(pom.get_Instance_HP().clickAddToCartFirst());
		System.out.println("Item added to cart");
	}

	@And("Go to checkout page")
	public void go_to_checkout_page() {
		clickOnElement(pom.get_Instance_HP().instantGoToCart());
		System.out.println("checked in checkout page");
		clickOnElement(pom.get_Instace_CP().checkOut());
		clickOnElement(pom.get_Instance_SIP().continueAsGuest());
	}

	@And("^Fil the Contact information \"([^\"]*)\"\"([^\"]*)\"$")
	public void fil_the_contact_information(String mailId, String mobileNumber) {
		moveToElement(pom.get_Instance_COP().contactInfoEmailId());
		inputValueElement(pom.get_Instance_COP().contactInfoEmailId(), mailId);
		inputValueElement(pom.get_Instance_COP().contactInfoMobileNumber(), mobileNumber);
		clickOnElement(pom.get_Instance_COP().continueToPaymentInformation());

	}

	@And("^Fill the payment imformation \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void fill_the_payment_imformation(String cardNumber, String firstName, String lastName, String address,
			String city, String state, String zipcode) {
		inputValueElement(pom.get_Instance_COP().creditCardAndDebitCardNumber(), cardNumber);
		moveToElement(pom.get_Instance_COP().firstNameForBilling());
		inputValueElement(pom.get_Instance_COP().firstNameForBilling(), firstName);
		inputValueElement(pom.get_Instance_COP().lastNameForBilling(), lastName);
		inputValueElement(pom.get_Instance_COP().addressForBilling(), address);
		inputValueElement(pom.get_Instance_COP().cityForBilling(), city);
		clickOnElement(pom.get_Instance_COP().stateForBilling());
		selection("byValue", state);
		inputValueElement(pom.get_Instance_COP().zipcodeForBilling(), zipcode);
		clickOnElement(pom.get_Instance_COP().placeYourOrder());

	}

	@Then("Validate the order confirmation message (.*)$")
	public void Validate_the_order_confirmation_message(String firstName) {
		moveToElement(pom.get_Instance_COP().placeYourOrder());
		String info = pom.get_Instance_COP().firstNameForBilling().getText();
		System.out.println("Title of text: " + info);

		// Validate the title of the page
		if (info.equals(firstName)) {
			System.out.println("Payment information filled successfully.");
		} else {
			System.out.println("Payment information filled not successfull");
		}
	}

}
