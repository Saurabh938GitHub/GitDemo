package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductListingPage {
	WebDriver driver;
	
	public ProductListingPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindAll(@FindBy(how = How.CSS, using = ".noo-product-inner"))
	private List<WebElement> prd_List; 
	
	@FindBy(how = How.XPATH, using = "//select[@id='pa_color']") 
	private WebElement dd_SelectColor;
	
	@FindBy(how = How.XPATH, using = "//select[@id='pa_size']") 
	private WebElement dd_SelectSize;
	
	@FindBy(how = How.XPATH, using = "//button[@class='single_add_to_cart_button button alt']") 
	private WebElement btn_AddToCart;
		 
	@FindBy(how = How.XPATH, using = "//a[@class='cart-button']/span/") 
	private WebElement btn_Cart;
		  
	public void select_Product(int productNumber) {
	prd_List.get(productNumber).click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,700)");
	}
	
	public void clickOn_color() throws InterruptedException {
	Select select1= new Select (dd_SelectColor); 
	select1.selectByIndex(1);
	Thread.sleep(1000);
	}
	 
	public void clickOn_size() throws InterruptedException {
    Select select1= new Select (dd_SelectSize); 
	select1.selectByIndex(1);
	Thread.sleep(1000);
	}
	
	public void clickOn_AddToCart() {
	btn_AddToCart.click();
	}
			

}
