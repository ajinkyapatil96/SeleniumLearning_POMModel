package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {
	
	//All the locators of page
	@FindBy(xpath = "//*[text()='Login']")
	WebElement txtLoginPage;
	
	@FindBy(name="username")
	WebElement pass;
	
	@FindBy(name="password")
	WebElement pass1;
	
	@FindBy(tagName = "button")
	WebElement btnLogin;
	
	//Initialization of locators/variables

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Methods required to perform test steps
	/*
	 * Author : Ajinkya Patil
	 * Date : 04 Feb 2023
	 * Description : This test method use to verify login page title
	 * Parameter return : String
	 * 
	 */
	public String titleOfLoginPage() {
		return txtLoginPage.getText();
		
	}
	
	/*
	 * Author : Ajinkya Patil
	 * Date : 04 Feb 2023
	 * Description : This test method use to verify current url of page
	 * Parameter return : String
	 * 
	 */
	public String urlOfPage() {
		return driver.getCurrentUrl();
		
	}
	/*
	 * Author : Ajinkya Patil
	 * Date : 04 Feb 2023
	 * Description : This test method use to set userNameValue
	 * Parameter return : String
	 * 
	 */
	public void setUserName(String usrName) {
		pass.sendKeys(usrName);
	}
	
	/*
	 * Author : Ajinkya Patil
	 * Date : 04 Feb 2023
	 * Description : This test method use to set PasswordValue
	 * 
	 */
	public void setPassword(String password) {
		pass1.sendKeys(password);
	}
	/*
	 * Author : Ajinkya Patil
	 * Date : 04 Feb 2023
	 * Description : This test method use to click on login button
	 * 
	 */
	public void clickLoginbtn() {
		btnLogin.click();
	}
	/*
	 * Author : Ajinkya Patil
	 * Date : 04 Feb 2023
	 * Description : This test method use to get title of build
	 * Parameter : String
	 * 
	 */
	
	public String getBuildTiltlt() {
		return driver.getTitle();
		
	}
}
