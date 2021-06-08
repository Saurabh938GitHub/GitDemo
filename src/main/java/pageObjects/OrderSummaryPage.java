package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage {
	
	WebDriver driver;
	public OrderSummaryPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
    }
		 
	@FindAll(@FindBy(how = How.XPATH, using = "//div[@class='noo-checkout-complete']")) 
	private List<WebElement> div_OrderSummary;

	public void printSummary(int i) {
	WebElement a= div_OrderSummary.get(i);
	String content= a.getText();
	System.out.println(content);
	}	
}
