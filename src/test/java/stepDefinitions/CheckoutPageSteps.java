package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;

public class CheckoutPageSteps {
	TestContext testContext;
	CheckoutPage checkoutPage;
	 
	public CheckoutPageSteps(TestContext context) {
	testContext = context;
	checkoutPage = testContext.getPageObjectManager().getCheckoutPage();
	}
	
	
	@And("^enter personal details on checkout page$")
	public void enter_personal_details_on_checkout_page() throws Throwable {
	checkoutPage.fill_PersonalDetails();
	checkoutPage.check_TermsAndCondition();
	checkoutPage.clickOn_PlaceOrder();	 
	}
}
