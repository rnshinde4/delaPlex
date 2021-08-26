package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ToolsQaPage {
	
	WebDriver driver;
	
	private By elementLink = By.xpath("(//div[@class='card-body'])[1]");
	private By header = By.xpath("//div[@class='main-header']");
	private By webTableButton = By.xpath("//span[text()='Web Tables']");
	private By addButton = By.xpath("//button[@id='addNewRecordButton']");
	private By firstNameInput = By.xpath("//input[@id='firstName']");
	private By lastNameInput = By.xpath("//input[@id='lastName']");
	private By userEmailInput = By.xpath("//input[@id='userEmail']");
	private By ageInput = By.xpath("//input[@id='age']");
	private By salaryInput = By.xpath("//input[@id='salary']");
	private By departmentInput = By.xpath("//input[@id='department']");
	private By submitButton = By.xpath("//button[@id='submit']");
	
	public ToolsQaPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void clickElementLink() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(elementLink) );
		driver.findElement(elementLink).click();
	}
	
	public boolean verifyHeader(String expectedHeader) {
		String actualHeader = driver.findElement(header).getText();
		if(!actualHeader.equals(expectedHeader)) {
			return false;
		}
		return true;
	}
	
	public void clickWebTableButton() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(webTableButton));
		driver.findElement(webTableButton).click();
	}
	
	public void clickAddButton() {
		driver.findElement(addButton).click();
	}
	
	public void addNewRecord(String firstName,String lastName,String email,String age,String salary,String deparment) {
		driver.findElement(firstNameInput).sendKeys(firstName);
		driver.findElement(lastNameInput).sendKeys(lastName);
		driver.findElement(userEmailInput).sendKeys(email);
		driver.findElement(ageInput).sendKeys(age);
		driver.findElement(salaryInput).sendKeys(salary);
		driver.findElement(departmentInput).sendKeys(deparment);
		driver.findElement(submitButton).click();
		
	}
	
	

}
