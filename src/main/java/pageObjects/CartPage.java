package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver driver;
	public CartPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
    }
		 
	@FindBy(how = How.XPATH, using = "//a[@class='cart-button']/span/i") 
	private WebElement btn_Cart;
		 
	@FindBy(how = How.XPATH, using = "//a[@class='checkout-button button alt wc-forward']") 
	private WebElement btn_ContinueToCheckout;
		 
    public void clickOn_Cart() {
	btn_Cart.click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,800)");
	}
	
    public void clickOn_ContinueToCheckout() throws InterruptedException{
	btn_ContinueToCheckout.click();
	Thread.sleep(5000);
    }
}
