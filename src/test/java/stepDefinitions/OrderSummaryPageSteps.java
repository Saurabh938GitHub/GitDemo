package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import pageObjects.CartPage;
import pageObjects.OrderSummaryPage;

public class OrderSummaryPageSteps {
	TestContext testContext;
	OrderSummaryPage orderSummaryPage;
	
	public OrderSummaryPageSteps(TestContext context) {
	testContext= context;
	orderSummaryPage= testContext.getPageObjectManager().getOrderSummaryPage();
	}
	
	@And("^place the order$")
	public void place_the_order() throws Throwable {
	orderSummaryPage.printSummary(0);
	System.out.println("OrderSummaryPageSteps");// git
	System.out.println("OrderSummaryPageSteps2");// git2
	}

}
