package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base_class.Base_Class;

public class Home_Page extends Base_Class {

	public Home_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement userAccountName() {
		WebElement accountName = driver.findElement(By.xpath("//span[@class='v-p-right-xxs line-clamp']"));
		return accountName;
	}

	public WebElement topDealLink() {
		WebElement topDeal_Link = driver.findElement(By.xpath("//a[text()='Top Deals']"));
		return topDeal_Link;
	}

	public WebElement dealOfTheDayLink() {
		WebElement dealOfTheDay_Link = driver.findElement(By.xpath("//a[text()='Deal of the Day']"));
		return dealOfTheDay_Link;
	}

	public WebElement yesBestBuySellsThatLink() {
		WebElement yesBestBuySellsThat_Link = driver.findElement(By.xpath("//a[text()='Yes, Best Buy Sells That']"));
		return yesBestBuySellsThat_Link;
	}

	public WebElement myBestBuyMembershipsLink() {
		WebElement myBestBuyMemberships_Link = driver
				.findElement(By.xpath("(//a[text()='My Best Buy Memberships'])[1]"));
		return myBestBuyMemberships_Link;
	}

	public WebElement creditCardsLink() {
		WebElement creditCards_Link = driver.findElement(By.xpath("//a[text()='Credit Cards']"));
		return creditCards_Link;
	}

	public WebElement moreLink() {
		WebElement more_Link = driver.findElement(By.xpath("//span[text()='More']"));
		return more_Link;
	}

	public WebElement giftCardsLink() {
		WebElement giftCards_Link = driver.findElement(By.xpath("(//a[text()='Gift Cards'])[2]"));
		return giftCards_Link;
	}

	public WebElement giftIdeasLink() {
		WebElement giftIdeas_Link = driver.findElement(By.xpath("(//a[text()='Gift Ideas'])[2]"));
		return giftIdeas_Link;
	}

	public WebElement accessibilityLink() {
		WebElement accessibility_Link = driver.findElement(By.xpath("//a[text()='Accessibility']"));
		return accessibility_Link;
	}

	public WebElement privacyLink() {
		WebElement privacy_Link = driver.findElement(By.xpath("//a[text()='Privacy']"));
		return privacy_Link;
	}

	public WebElement termsAndConditionsLink() {
		WebElement termsAndConditions_Link = driver.findElement(By.xpath("//a[text()='Terms & Conditions']"));
		return termsAndConditions_Link;
	}

	public WebElement interestBasedAdsLink() {
		WebElement interestBasedAds_Link = driver.findElement(By.xpath("//a[text()='Interest-Based Ads']"));
		return interestBasedAds_Link;
	}

	public WebElement accessibilityTitle() {
		WebElement accessibility_Title = driver.findElement(By.className("page-title"));
		return accessibility_Title;

	}

	public WebElement termsAndConditionsTitle() {
		WebElement termsAndConditions_Title = driver.findElement(By.className("page-title"));
		return termsAndConditions_Title;
	}

	public WebElement interestBasedAdsTitle() {
		WebElement interestBasedAds_Title = driver.findElement(By.className("page-title"));
		return interestBasedAds_Title;
	}

	public WebElement privacyTitle() {
		WebElement privacy_Title = driver.findElement(By.className("page-title"));
		return privacy_Title;
	}

	public WebElement searchBox() {
		WebElement search_Box = driver.findElement(By.id("gh-search-input"));
		return search_Box;
	}

	public WebElement someProduct() {
		WebElement some_Product = driver.findElement(By.className("product-image "));
		return some_Product;
	}

	public WebElement enterSearch() {
		WebElement enter_Search = driver.findElement(By.className("header-search-button"));
		return enter_Search;
	}

	public WebElement clickAddToCartFirst() {
		WebElement clickAddToCart_First = driver.findElement(By.xpath("(//button[text()='Add to Cart'])[1]"));
		return clickAddToCart_First;
	}

	public WebElement clickAddToCartSecond() {
		WebElement clickAddToCart_Second = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		return clickAddToCart_Second;
	}

	public WebElement clickContinue() {
		WebElement click_Continue = driver.findElement(By.xpath("//span[text()='Continue']"));
		return click_Continue;
	}

	public WebElement clickGoToCart() {
		WebElement clickGoTo_Cart = driver.findElement(By.xpath("//span[text()='Go to Cart']"));
		return clickGoTo_Cart;
	}

	public WebElement menuTop() {
		WebElement menu_Top = driver.findElement(By.xpath("//button[text()='Menu']"));
		return menu_Top;
	}

	public WebElement appliancesDeparment() {
		WebElement appliances_Deparment = driver.findElement(By.xpath("//button[text()='Appliances']"));
		return appliances_Deparment;
	}

	public WebElement majorKitchenAppliances() {
		WebElement majorKitchen_Appliances = driver
				.findElement(By.xpath("//button[text()='Major Kitchen Appliances']"));
		return majorKitchen_Appliances;
	}

	public WebElement refrigeratorsMenu() {
		WebElement refrigerators_Menu = driver.findElement(By.xpath("//a[text()='Refrigerators']"));
		return refrigerators_Menu;
	}

	public WebElement frenchDoorRefrigerators() {
		WebElement frenchDoor_Refrigerators = driver.findElement(By.xpath("//a[text()='French Door Refrigerators']"));
		return frenchDoor_Refrigerators;
	}

	public WebElement selectRefrigerators() {
		WebElement select_Refrigerators = driver.findElement(By.className("product-image"));
		return select_Refrigerators;
	}

	public WebElement clickTopCart() {
		WebElement clickTop_Cart = driver.findElement(By.xpath("//span[text()='Cart']"));
		return clickTop_Cart;
	}

	public WebElement brandMenu() {
		WebElement brand_Menu = driver.findElement(By.xpath("//button[text()='Brands']"));
		return brand_Menu;
	}

	public WebElement playStationMenu() {
		WebElement playStation_Menu = driver.findElement(By.xpath("//a[text()='PlayStation']"));
		return playStation_Menu;
	}

	public WebElement ps5ConsolesMenu() {
		WebElement ps5Consoles_Menu = driver.findElement(By.xpath("//a[text()='PS5 Consoles']"));
		return ps5Consoles_Menu;
	}

	public WebElement instantGoToCart() {
		WebElement instant_GoToCart = driver.findElement(By.xpath("//a[text()='Go to Cart']"));
		return instant_GoToCart;
	}
}
