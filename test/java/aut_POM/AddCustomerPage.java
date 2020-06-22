package aut_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends BaseClass {

	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	@FindBy(how=How.XPATH, using = "//a[@href='#']//span[contains(text(),'Customers')]")
	WebElement customerMenu;
	
	public void customerTabMenu() {
		customerMenu.click();
	}
	
	@FindBy(how=How.XPATH, using = "//span[@class='menu-item-title'][contains(text(),'Customers')]")
	WebElement customeritemMenu;
	
	public void customerItemMenu() {
		customeritemMenu.click();
	}
	
	
	@FindBy(how=How.XPATH, using = "//a[@class='btn bg-blue']")
	WebElement btnAddNew;
	
	public void addNewBtn() {
		btnAddNew.click();
	}
	
	
	@FindBy(how=How.ID, using = "Email")
	WebElement emailIdTxtBox;
	
	public void emailId(String email) {
		emailIdTxtBox.sendKeys(email);
	}
	
	
	@FindBy(how=How.ID, using = "Password")
	WebElement passwordTxtBox;
	
	public void password(String passWord) {
		passwordTxtBox.sendKeys(passWord);
	}
	
	@FindBy(how=How.ID, using = "FirstName")
	WebElement firstNameTxtBox;
	
	public void firstName(String fname) {
		firstNameTxtBox.sendKeys(fname);
	}
	
	@FindBy(how=How.ID, using = "LastName")
	WebElement lastNameTxtBox;
	
	public void lastName(String lname) {
		lastNameTxtBox.sendKeys(lname);
	}
	@FindBy(how=How.ID, using = "Gender_Male")
	WebElement maleGender;

	public void maleGender() {
		maleGender.click();
	}
	
	@FindBy(how=How.ID, using = "Gender_Female")
	WebElement femaleGender;
	
	public void femaleGender() {
		femaleGender.click();
	}
	
	@FindBy(how=How.ID, using = "DateOfBirth")
	WebElement dob;
	
	public void dateOfBirth(String db) {
		dob.sendKeys(db);
	}
	
	@FindBy(how=How.ID, using = "Company")
	WebElement companyTxtBox;
	
	public void companyName(String company) {
		companyTxtBox.sendKeys(company);
	}
	
	@FindBy(how=How.ID, using = "IsTaxExempt")
	WebElement taxExemptChkBox;
	
	public void taxExemptCk() {
		taxExemptChkBox.click();
	}
	
	@FindBy(how=How.ID, using = "//div[@class='k-multiselect-wrap k-floatwrap']")
	WebElement customerRole;
	
	public void customerRole() {
		customerRole.click();
	}
	
	@FindBy(how=How.XPATH, using = "//li[contains(text(),'Adminstrators')]")
	WebElement listItemAdminstrators;
	
	public void administratorCustRole() {
		listItemAdminstrators.click();
	}
	
	@FindBy(how=How.XPATH, using = "//li[contains(text(),'Registered')]")
	WebElement listItemRegistered;
	
	public void registeredCustRole() {
		listItemRegistered.click();
	}
	
	@FindBy(how=How.XPATH, using = "//li[contains(text(),'Guests')]")
	WebElement listItemGuest;

	public void guestCustRole() {
		listItemGuest.click();
	}
	
	@FindBy(how=How.XPATH, using = "//li[contains(text(),'Vendors')]")
	WebElement listItemVendors;
	
	public void vendorsCustRole() {
		listItemVendors.click();
	}
	
	@FindBy(how=How.ID, using = "VendorId")
	WebElement mgrVendorDD;
	
	public void mgrOfVendor(String mgrVndr) {
		selectFromDropDown(mgrVendorDD, mgrVndr);
	}
	
	@FindBy(how=How.ID, using = "Active")
	WebElement activeChkBox;
	
	public void activeCkBox() {
		activeChkBox.click();
	}
	
	@FindBy(how=How.ID, using = "AdminComment")
	WebElement adminCommentTxtBox;
	
	public void adminContentTxt(String txtAdminComment) {
		adminCommentTxtBox.sendKeys(txtAdminComment);
	}
	
	@FindBy(how=How.NAME, using = "save")
	WebElement saveBtn;
	
	public void saveButton() {
		saveBtn.click();
	}
	
	@FindBy(how=How.NAME, using = "save-continue")
	WebElement saveAndContinueBtn;
	
	public void saveContinueBtn() {
		saveAndContinueBtn.click();
	}
	
	@FindBy(how=How.XPATH, using = "//a[contains(text(),'back to customer list')]")
	WebElement backToCustomerListLink;
	
	public void backToCustomerLink() {
		backToCustomerListLink.click();
	}
}
