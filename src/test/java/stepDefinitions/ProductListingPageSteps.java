package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import pageObjects.ProductListingPage;

public class ProductListingPageSteps {
	TestContext testContext;
	ProductListingPage productListingPage;
	
	public ProductListingPageSteps(TestContext context) {
	testContext= context;
	productListingPage= testContext.getPageObjectManager().getProductListingPage();
	}
	
	@And("^choose to buy the first item$")
	public void choose_to_buy_the_first_item() throws Throwable {
	productListingPage.select_Product(0);
	productListingPage.clickOn_color();
	productListingPage.clickOn_size();
	productListingPage.clickOn_AddToCart(); 
	System.out.println("Yes");// git verification
	System.out.println("No");// git verification
	}

}
