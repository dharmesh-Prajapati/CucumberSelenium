package stepDefinitions;

import java.util.concurrent.TimeUnit;

import aut_POM.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps extends BaseSteps {
	
	
	@Given("user launch browser")
	public void user_launch_browser() {
		driver = getDriverInstance(prop.getProperty("browser"));
		driver.manage().window().maximize();
	}

	@When("user opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String urname, String pass) {
		lp = new LoginPage(driver);
		lp.username(urname);
		lp.password(pass);
		lp.login();
	}

	@When("user click on Login")
	public void user_click_on_Login() {
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
	}

	@When("user click on Logout link")
	public void user_click_on_Logout_link() {
	}

	@Then("close browser")
	public void close_browser() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}


}
