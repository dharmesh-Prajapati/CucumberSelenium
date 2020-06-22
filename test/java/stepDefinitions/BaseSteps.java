package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import aut_POM.AddCustomerPage;
import aut_POM.LoginPage;

public class BaseSteps {

	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage aCp;

	static public Properties prop;

	/*
	 *  TestHelper class helps all the test script classes with pre requisites.
	 */
	public BaseSteps() {

		prop = new Properties();
		String fileName = "C:\\Users\\Dharmesh\\Documents\\Projects\\utilites\\cucumberConfig.properties";
		InputStream is = null;
		try {
			is = new FileInputStream(fileName);
			prop.load(is);
		} catch (FileNotFoundException ex) {
		} catch (IOException ex) {
		}
	}
	
	
	/*
	 * returns instance of Webdriver for respective browser
	 */
	public WebDriver getDriverInstance(String browserName) {

		switch(browserName.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeDriverExe"));
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", prop.getProperty("geckoDriverExe"));
			driver = new FirefoxDriver();
			break;
		}
		
		return driver;
	}
}
