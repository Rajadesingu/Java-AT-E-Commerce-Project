package configuration_manager;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties pro;

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\q\\eclipse-workspace\\BestBuy_Ecommerce_Website\\src\\test\\java\\configuration_manager\\TestData.properties");
		FileInputStream fis = new FileInputStream(f);
		pro = new Properties();
		pro.load(fis);
	}

	public String get_Browser() {
		String browser = pro.getProperty("browser");
		return browser;
	}

	public String get_Url() {
		String url = pro.getProperty("url");
		return url;

	}

	public String enter_FirstName() {
		String url = pro.getProperty("firstName");
		return url;

	}

}
