package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {
	WebDriver driver;
	TestContext testContext;
	HomePage homePage;
	 
	public HomePageSteps(TestContext context) {
	testContext = context;
	homePage = testContext.getPageObjectManager().getHomePage();
	}

	@Given("^user is on Home page$")
	public void user_is_on_Home_page() throws Throwable {
	driver = testContext.getWebDriverManager().getDriver();
	homePage.navigateTo_HomePage();}
	

	@When("^he search for \"([^\"]*)\"$")
	public void he_search_for(String arg1) throws Throwable {
	homePage.perform_Search("dress");}
	

}
