package PageRepository;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;
import Utilities.FetchDataFromExcel;


public class TaskNewCustomerCreation extends BaseClass {
	
	WebDriver driver;
	
	public TaskNewCustomerCreation(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='text']")
	WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath="//*[text()='New Customer']")
	WebElement newCustLink;
	
	
	@FindBy(xpath="//input[@name='name']")
	WebElement Cust_name;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement Gender;
	
	@FindBy(xpath="//input[@name='dob']")
	WebElement Dob;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement Address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement City;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement State;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement Pin;
	
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement Mobile;
	
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement Email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Submit;
	
	@FindBy(xpath="//td[text()='Customer ID']/following-sibling::td")
	WebElement custID;
	
	@FindBy(xpath="//a[text()='New Account']")
	WebElement newAccountPage;
	
	@FindBy(xpath="//input[@name=\"inideposit\"]")
	WebElement depositField;
	
	@FindBy(xpath="//input[@name=\"button2\"]")
	WebElement submitBtn;
	
	@FindBy(xpath="//td[text()='Account ID']/following-sibling::td")
	WebElement acctID;
	
	@FindBy(xpath="//a[text()='Log out']")
	WebElement scrollToLogOut;
	

	@FindBy(xpath="//input[@name='cusid']")
	WebElement customerIDField;
	
	
	public void enterUserName(String uName)
	{
		userName.sendKeys(uName);
	}
	
	public void enterPwd(String pswd)
	{
		pwd.sendKeys(pswd);
	}
	
	public void clickLogin()
	{
		loginbtn.click();
	}
	
	
	public void clickOnNewCustomer()
	{
		newCustLink.click();
	}
	
	public void selectGender()
	{
		Gender.click();
	}
	
	public void enteralldetails(List<List<String>> data)
	{
		Cust_name.sendKeys(data.get(1).get(0));
		Dob.sendKeys(data.get(1).get(1));
		Address.sendKeys(data.get(1).get(2));
		City.sendKeys(data.get(1).get(3));
		State.sendKeys(data.get(1).get(4));
		Pin.sendKeys(data.get(1).get(5));
		Mobile.sendKeys(data.get(1).get(6));
		Email.sendKeys(data.get(1).get(7));
		Password.sendKeys(data.get(1).get(8));
		
	}
	
	
	public void clickOnSubmit()
	{
		Submit.click();
	}
	public String custIDRef()
	{
		return custID.getText();
		
	}

	public void newAccountPageNavigation()
	{
		newAccountPage.click();
		
	}
	
	public void  enterCustID(String CusID) throws IOException
	{
		
		customerIDField.sendKeys(CusID);
		
	}
	
	public void depositFieldvalue()
	{
		depositField.sendKeys("50000");
		
	}
	public void submitButton()
	{
		submitBtn.click();
		
	}
	
	public String acctIDRef()
	{
		return acctID.getText();
		
	}
	
	public void scrollLogout()
	{
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].scrollIntoView(true)", scrollToLogOut);
		
	}
	
	public void clicksLogout()
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", scrollToLogOut);
		
	}
	
	public void successfulLogout()
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
	 System.out.println("User Successfully Logged out");
		
	}

}
