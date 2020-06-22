package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\Dharmesh\\Documents\\Projects\\JavaTDDFramework\\cucumberSelenium\\src\\test\\resources\\Features\\Login.feature",
 glue={"stepDefinitions"}
 )
 

public class LoginTestRunner {

	
	
	
}
