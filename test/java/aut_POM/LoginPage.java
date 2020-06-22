package aut_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(how=How.ID, using="Email")
	WebElement emailIdTxtBox;
	
	@FindBy(how=How.ID, using="Password")
	WebElement passwordTxtBox;
	
	@FindBy(how=How.XPATH, using="//input[@value='Log in']")
	WebElement loginBtn;
	
	public void username(String userId) {
		emailIdTxtBox.clear();
		emailIdTxtBox.sendKeys(userId);
	}
	
	public void password(String password) {
		passwordTxtBox.clear();
		passwordTxtBox.sendKeys(password);
	}
	
	public void login() {
		loginBtn.submit();
	}

	public void userPasswordLogin(String userId, String Password) {
		username(userId);
		password(Password);
		login();
		
	}
}
