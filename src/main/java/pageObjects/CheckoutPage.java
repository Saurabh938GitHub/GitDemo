package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='billing_first_name']") 
	 private WebElement txtbx_FirstName;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='billing_last_name']") 
	 private WebElement txtbx_LastName;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='billing_company']") 
	 private WebElement txtbx_CompanyName;
	 
	 @FindBy(how = How.XPATH, using = "//span[@id='select2-billing_country-container']") 
	 private WebElement lbl_Country;
	 
	 @FindBy(how = How.XPATH, using = "//input[@class='select2-search__field']") 
	 private WebElement txtbx_CountryInput;
	 
	 @FindBy(how = How.XPATH, using = "//*[text()='Street address']") 
	 private WebElement lbl_StreetAddress;
	 
	 @FindBy(how = How.CSS, using = "#billing_address_1") 
	 private WebElement txtbx_StreetAddress1;
	 
	 @FindBy(how = How.CSS, using = "#billing_address_2") 
	 private WebElement txtbx_StreetAddress2;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='billing_city']") 
	 private WebElement txtbx_Citi;
	 
	 @FindBy(how = How.XPATH, using = "//span[@id='select2-billing_state-container']") 
	 private WebElement lbl_State;
	 
	 @FindBy(how = How.XPATH, using = "//input[@class='select2-search__field']") 
	 private WebElement txtbx_StateInput;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='billing_postcode']") 
	 private WebElement txtbx_Zip;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='billing_phone']") 
	 private WebElement txtbx_Phone;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='billing_email']") 
	 private WebElement txtbx_Email;
	 
	 @FindBy(how = How.CSS, using = "#terms.input-checkbox") 
	 private WebElement chkbx_AcceptTermsAndCondition;
	 
	 @FindBy(how = How.XPATH, using = "//button[@id='place_order']") 
	 private WebElement btn_PlaceOrder;
	 
	 
	 public void enter_Name(String name) {
	 txtbx_FirstName.sendKeys(name);
	 }
	 
	 public void enter_LastName(String lastName) {
	 txtbx_LastName.sendKeys(lastName);
	 }
	 
	 public void enter_CompanyName(String companyName) {
	 txtbx_CompanyName.sendKeys(companyName);
	 }
	 
	 public void enter_Email(String email) {
	 txtbx_Email.sendKeys(email);
	 }
	 
	 public void enter_Phone(String phone) {
	 txtbx_Phone.sendKeys(phone);
	 }
	 
	 public void enter_City(String city) {
	 txtbx_Citi.sendKeys(city);
	 }
	 
	 public void enter_Address1(String address) {
	 lbl_StreetAddress.click();
	 txtbx_StreetAddress1.sendKeys(address);
	 }
	 
	 public void enter_Address2(String address) {
	 txtbx_StreetAddress2.sendKeys(address);
	 }
	 
	 public void enter_PostCode(String postCode) {
	 txtbx_Zip.sendKeys(postCode);
	 }
	 
	 public void select_Country(String country) throws AWTException, InterruptedException {
	 lbl_Country.click();
	 Robot robot= new Robot();
	 txtbx_CountryInput.sendKeys(country);
	 robot.keyPress(KeyEvent.VK_ENTER);
	 Thread.sleep(1000);
	 }
	 
	 public void select_State(String state) throws AWTException, InterruptedException {
	 lbl_State.click();
	 Robot robot= new Robot();
	 txtbx_StateInput.sendKeys(state);
	 robot.keyPress(KeyEvent.VK_ENTER);
	 Thread.sleep(1000);
	 }
	 
	 public void check_TermsAndCondition() throws InterruptedException {
	 JavascriptExecutor js= (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,-300)");
	 chkbx_AcceptTermsAndCondition.click();
	 Thread.sleep(2000);
	 }
	 
	 public void clickOn_PlaceOrder() {
	 btn_PlaceOrder.submit();
	 }
	 
	 
	 public void fill_PersonalDetails() throws AWTException, InterruptedException {
	 enter_Name("Aotomation");
	 enter_LastName("Test");
	 enter_CompanyName("Infosys");
	 select_Country("India");
	 enter_Address1("Shalimar Bagh");
	 enter_Address2("Near North Campus");
	 enter_City("Delhi");
	 select_State("Delhi");
	 enter_PostCode("110088");
	 enter_Phone("0000000000");
	 enter_Email("Automation@gmail.com");
	 Thread.sleep(3000);
	 }

}
