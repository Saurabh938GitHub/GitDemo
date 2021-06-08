package seleniumTests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2E_Test {

		private static WebDriver driver;
		 
		 public static void main(String[] args) throws InterruptedException, AWTException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurabh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://www.shop.demoqa.com");
		 WebElement searchIcon= driver.findElement(By.xpath("//i[@class=\"icon_search\"]"));
		 searchIcon.click();
		 
		 Robot robot=new Robot();
		 WebElement enterIcon= driver.findElement(By.xpath("//input[@name=\"s\"]"));
		 enterIcon.sendKeys("dress");
		 enterIcon.click();
		 driver.get("http://shop.demoqa.com/?s=dress&post_type=product");
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,500)");
		 
		 List<WebElement> items = driver.findElements(By.cssSelector(".noo-product-inner"));
		 items.get(0).click();
		 
		 js.executeScript("window.scrollBy(0,700)");
		 
		 WebElement selectColor= driver.findElement(By.xpath("//select[@id='pa_color']"));
		 Select select1= new Select (selectColor); 
		 select1.selectByIndex(1);
		 Thread.sleep(1000);
		 
		 WebElement selectSize= driver.findElement(By.xpath("//select[@id='pa_size']"));
		 Select select2= new Select (selectSize);
		 select2.selectByIndex(1);
		 Thread.sleep(1000);

		 WebElement addToCart = driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']"));
		 addToCart.click();
		 
		 WebElement cart = driver.findElement(By.xpath("//a[@class='cart-button']/span/i"));
		 cart.click();
		 
		 js.executeScript("window.scrollBy(0,800)");
		 
		 WebElement continueToCheckout = driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']"));
     	 continueToCheckout.click(); 
		 
 
		 Thread.sleep(5000);
		 WebElement firstName = driver.findElement(By.xpath("//input[@id='billing_first_name']"));
		 firstName.sendKeys("Lakshay");
		 Thread.sleep(1000);
		 
		 WebElement lastName = driver.findElement(By.xpath("//input[@id='billing_last_name']"));
		 lastName.sendKeys("Sharma");
		 Thread.sleep(1000);
		 
		 WebElement companyName = driver.findElement(By.xpath("//input[@id='billing_company']"));
		 companyName.sendKeys("xyz");
		 Thread.sleep(1000);
		 
		 WebElement country = driver.findElement(By.xpath("//span[@id='select2-billing_country-container']"));
		 country.click();
		 Thread.sleep(1000);
		 
		 WebElement countryInput = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		 countryInput.sendKeys("India");
		 robot.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(1000);
		 
		 js.executeScript("window.scrollBy(0,400)");
		 
		 WebElement streetAddress = driver.findElement(By.xpath("//*[text()='Street address']"));
		 streetAddress.click();;
		 
		 WebElement streetAddress1 = driver.findElement(By.cssSelector("#billing_address_1"));
		 streetAddress1.sendKeys("T 801, B Wing");
		 
		 WebElement streetAddress2 = driver.findElement(By.cssSelector("#billing_address_2"));
		 streetAddress2.sendKeys("Silvernese Apartment, Indore");
		 
		 WebElement citi = driver.findElement(By.xpath("//input[@id='billing_city']"));
		 citi.sendKeys("Indore");
		
		 WebElement state = driver.findElement(By.xpath("//span[@id='select2-billing_state-container']"));
		 state.click();
		 Thread.sleep(1000);
		 
		 WebElement stateInput = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		 stateInput.sendKeys("Madhya Pradesh");
		 robot.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(1000);
		 
		 WebElement zip = driver.findElement(By.xpath("//input[@id='billing_postcode']"));
		 zip.click();
		 zip.sendKeys("23456");
		 
		 WebElement phone = driver.findElement(By.xpath("//input[@id='billing_phone']"));
		 phone.sendKeys("07438862327");
		 
		 WebElement emailAddress = driver.findElement(By.xpath("//input[@id='billing_email']"));
		 emailAddress.sendKeys("test@gmail.com");
		 
		 js.executeScript("window.scrollBy(0,-300)");
		 Thread.sleep(3000);
		 
		 WebElement acceptTC = driver.findElement(By.cssSelector("#terms.input-checkbox"));
		 acceptTC.click();
		
		 WebElement placeOrder = driver.findElement(By.xpath("//button[@id='place_order']"));
		 placeOrder.submit();
		 Thread.sleep(5000);
		 
		 List<WebElement> orderSummary= driver.findElements(By.xpath("//div[@class='entry-content']"));
		 //System.out.println(orderSummary.size());
		 for(int i=0;i<1;i++)
		 {
			 WebElement a= orderSummary.get(i);
			 String content= a.getText();
			 System.out.println(content);
		 }
		 
		 driver.quit();
		 
		 }

}
