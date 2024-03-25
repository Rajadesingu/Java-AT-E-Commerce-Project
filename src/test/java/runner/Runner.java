package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import base_class.Base_Class;
import configuration_manager.File_Reader_Manager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepdefinition.Step_Definition;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\feature\\TC009_Verify_Checkout_Process.feature", glue = "stepdefinition")

public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() throws Throwable {

		String browser = File_Reader_Manager.get_Instance().get_InstanceCR().get_Browser();
		String url = File_Reader_Manager.get_Instance().get_InstanceCR().get_Url();
		driver = Base_Class.getBrowser(browser);
		driver = Base_Class.getUrl(url);

		driver = Step_Definition.driver;
	}

	@AfterClass
	public static void close() {
		driver.close();

	}
}
