package Com.Orange.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.OrangeHRM.qa.base.TestBase;

public class OrangeHRMHomepage extends TestBase{

	
//1
	@FindBy(xpath = "//a[contains(text(),'Reports')]")
	WebElement Reports;
	
	@FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
	WebElement ReporterName;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement SearchButton;
	
//	Employee tab
	@FindBy(xpath = "//a[@class=\"oxd-topbar-body-nav-tab-item\" and contains(text(),'Employee List')]")
	WebElement EmployeeListPage;
	
	@FindBy (xpath = "//input[@placeholder=\"Type for hints...\"][1]")
	WebElement EmpName;
	
	
//	Add Employee
	
	@FindBy (xpath = "//a[@class=\"oxd-topbar-body-nav-tab-item\" and contains(text(),\"Add Employee\")]")
	WebElement AddEmp;
	
	@FindBy(xpath = "//input[@name=\"firstName\"]")
	WebElement EmpFirstName;
	
//2	
	public OrangeHRMHomepage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
//3
	public String  Reporterpage(String Name) throws InterruptedException {
		
		Reports.click();
		Thread.sleep(2000);
		ReporterName.sendKeys(Name);
		
		return ReporterName.getText();
	}
//4	
	public String EmployeeList(String EName) throws InterruptedException
	{
		EmployeeListPage.click();
		Thread.sleep(2000);
		EmpName.sendKeys(EName);
		Thread.sleep(2000);
		return EmpName.getText();
	}
//	5
	public String AddEmployeeTab( String Emp1stName) throws InterruptedException
	{
		AddEmp.click();
		Thread.sleep(1000);
		EmpFirstName.sendKeys(Emp1stName);
		Thread.sleep(1000);
		return EmpFirstName.getText();
		
	}
}
