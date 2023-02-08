package test;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@Test(priority = 0, groups= {"smoke","regression"})
	public void verifyTitleOfLoginPage() {
		String verifyTitleOfLoginPge = loginPage.titleOfLoginPage();
		AssertJUnit.assertEquals(verifyTitleOfLoginPge, "Login");
	}
	@Test(priority = 1, groups= {"smoke","regression"})
	public void verifyCurrentUrlOfPage() {
		String verifyUrlOfPage = loginPage.urlOfPage();
		AssertJUnit.assertEquals(verifyUrlOfPage, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority = 2, groups= {"smoke","regression"})
	public void verifyLoginWithCorrectCredential() {
		loginPage.setUserName("Admin");
		loginPage.setPassword("admin123");
		loginPage.clickLoginbtn();
		String titleOfDash = dashboardPage.titleOfDashBoardPage();
		AssertJUnit.assertEquals(titleOfDash, "Dashboard");
		
	}
	@Test(priority = 3, groups= {"smoke","regression"})
	public void verifyBuildTitleName() {
		String verifyTitleOfBuild = loginPage.getBuildTiltlt();
		AssertJUnit.assertEquals(verifyTitleOfBuild, "OrangeHRM");
	}
	

}
