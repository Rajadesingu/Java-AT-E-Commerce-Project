package base_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;

	// Open Browser
	public static WebDriver getBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();

			} else if (browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();

			} else if (browserName.equalsIgnoreCase("ie")) {
				driver = new InternetExplorerDriver();
			}
		} catch (Exception e) {
			System.out.println("Browser open");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	public static WebDriver getUrl(String url) {
		driver.get(url);
		return driver;
	}

	public static void closeBrowser() {
		driver.close();

	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void backward() {
		driver.navigate().back();

	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void pageUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView();", element);
	}

	public static void pageDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView();", element);
	}

	public void explicitVidibilityOfWait(WebElement ele, int seconds) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(ele));

	}

	public static void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();

	}

	public static void inputValueElement(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void findElement(String attributeValue, String value) {

		driver.findElement(By.id(attributeValue));
	}

	public static void clickOnElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void implicit_Wait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public static void actionMethod(WebElement Element) {
		Actions ac = new Actions(driver);
		ac.contextClick(Element).build().perform();

	}

	public String getScreenshot(String screenshotName) throws IOException {

		String path = "D:\\EclipseClass\\DemoWebShopProject\\snap\\" + screenshotName + ".png";
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(source, dest);
		return path;

	}

	public Robot robotClass() throws AWTException {
		Robot rp = new Robot();
		return rp;

	}

	public static void selection(String Option, String value) {
		Select sc = new Select(null);

		try {
			if (Option.equalsIgnoreCase("byIndex")) {
				int parseInt = Integer.parseInt(value);
				sc.selectByIndex(parseInt);
			} else if (Option.equalsIgnoreCase("byValue")) {
				sc.selectByValue(value);
			} else if (Option.equalsIgnoreCase("byVisibleText")) {
				sc.selectByVisibleText(value);
			} else {
				System.out.println("Invalid option");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
