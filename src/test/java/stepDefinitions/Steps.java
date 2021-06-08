//package stepDefinitions;
//
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
//import dataProviders.ConfigFileReader;
//import managers.FileReaderManager;
//import managers.PageObjectManager;
//import managers.WebDriverManager;
//import pageObjects.CartPage;
//import pageObjects.CheckoutPage;
//import pageObjects.HomePage;
//import pageObjects.OrderSummaryPage;
//import pageObjects.ProductListingPage;
//
//public class Steps {
//
//	private static WebDriver driver;
//	
//	HomePage homePage;
//	ProductListingPage productListingPage;
//	CartPage cartPage;
//	CheckoutPage checkoutPage;
//	OrderSummaryPage orderSummaryPage;
//	PageObjectManager pageObjectManager;
//	WebDriverManager webDriverManager;
//	
//	@Given("^user is on Home page$")
//	public void user_is_on_Home_page() throws Throwable {
//	webDriverManager = new WebDriverManager();
//	driver = webDriverManager.getDriver();
//	pageObjectManager = new PageObjectManager(driver);
//	homePage = pageObjectManager.getHomePage();
//	homePage.navigateTo_HomePage();}
//	
//
//	@When("^he search for \"([^\"]*)\"$")
//	public void he_search_for(String arg1) throws Throwable {
//	homePage = pageObjectManager.getHomePage();
//	homePage.perform_Search("dress");}
//	
//
//	@And("^choose to buy the first item$")
//	public void choose_to_buy_the_first_item() throws Throwable {
//	productListingPage = pageObjectManager.getProductListingPage();
//	productListingPage.select_Product(0);
//	productListingPage.clickOn_color();
//	productListingPage.clickOn_size();
//	productListingPage.clickOn_AddToCart(); }
//	
//
//	@And("^moves to checkout from mini cart$")
//	public void moves_to_checkout_from_mini_cart() throws Throwable {
//	cartPage = pageObjectManager.getCartPage();
//	cartPage.clickOn_Cart();
//	cartPage.clickOn_ContinueToCheckout(); }
//	
//
//	@And("^enter personal details on checkout page$")
//	public void enter_personal_details_on_checkout_page() throws Throwable {
//	checkoutPage = pageObjectManager.getCheckoutPage();
//	checkoutPage.fill_PersonalDetails();
//	checkoutPage.check_TermsAndCondition();
//	checkoutPage.clickOn_PlaceOrder();	 
//	}
//
//	@And("^place the order$")
//	public void place_the_order() throws Throwable {
//	orderSummaryPage = pageObjectManager.getOrderSummaryPage();
//	orderSummaryPage.printSummary(0);
//	driver.quit();
//	}
//}
