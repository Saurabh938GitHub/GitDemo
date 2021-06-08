package stepDefinitions;

import com.cucumber.listener.Reporter;

import cucumber.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	TestContext testContext;
	 
	 public Hooks(TestContext context) {
	 testContext = context;
	 }
	 
	 @Before
	 public void setUp(Scenario sc) {
	 Reporter.assignAuthor("Mahan Shaurya");
	 String scenarioName= sc.getName();
	 System.out.println("<<<-----------------------------Scenario Starts----------------------------->>>");
	 System.out.println("Scenario is: "+scenarioName);
	 System.out.println();
	 System.out.println("waah");//git
	 }
	 
	 @After
	 public void tearDown() {
	 System.out.println("<<<-----------------------------Scenario Stops------------------------------>>>");
	 testContext.getWebDriverManager().closeDriver();
	 }

}
