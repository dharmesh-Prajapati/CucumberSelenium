package aut_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public void selectFromDropDown( WebElement element, String text) {

		Select sldpdn = new Select(element);
		sldpdn.selectByVisibleText(text);
	}
}
