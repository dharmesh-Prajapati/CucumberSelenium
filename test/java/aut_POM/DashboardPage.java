package aut_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BaseClass{

	WebDriver driver;

	public DashboardPage(	WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	@FindBy(how=How.XPATH, using="//a/span[@class='logo-lg']")
	WebElement dashboardLogo;

	
}
