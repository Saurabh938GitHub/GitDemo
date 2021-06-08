package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import dataProviders.ConfigFileReader;
import managers.FileReaderManager;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//i[@class=\"icon_search\"]") 
	private WebElement btn_SearchIcon;
		 
	@FindBy(how = How.XPATH, using = "//input[@name=\"s\"]")
	private WebElement txtbx_EnterIcon; 
		 
	public void perform_Search(String search) throws AWTException {
	btn_SearchIcon.click();
	txtbx_EnterIcon.sendKeys(search);
	txtbx_EnterIcon.click();
	driver.get("http://shop.demoqa.com/?s=dress&post_type=product");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
    }
		 
	public void navigateTo_HomePage() {
	driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

}
