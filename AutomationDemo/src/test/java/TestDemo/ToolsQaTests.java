package TestDemo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class ToolsQaTests {
	
	
	ToolsQaPage toolsQAPage = new ToolsQaPage(DriverFactory.initDriver());
	WebDriver driver = DriverFactory.getDriver();
	String firstName = "Rupali";
	String lastName = "Shinde";
	String email = "rns@abc.com";
	String age = "29";
	String salary ="15000";
	String department = "IT";
	String elementsHeader = "Elements";
	String webTableHeader = "Web Tables";
	
	@BeforeClass
	public void launchUrl() {
		driver.get("https://demoqa.com/");
	}
	
	@Test
	public void addNewRecordandVerify() {
		toolsQAPage.clickElementLink();
		Assert.assertTrue(toolsQAPage.verifyHeader(elementsHeader),"element present");
		toolsQAPage.clickWebTableButton();
		Assert.assertTrue(toolsQAPage.verifyHeader(webTableHeader));
		toolsQAPage.clickAddButton();
		toolsQAPage.addNewRecord(firstName, lastName, email, age, salary, department);
		
		
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
