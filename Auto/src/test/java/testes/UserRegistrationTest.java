package testes;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LogInPage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase

{
	HomePage homeObj;
	UserRegistrationPage userregisterObj;
	LogInPage loginObj;
	String FirstName = "zlaza";
	String Email = "tapmal@live.com";
	String Passowrd = "123456040";

	@Test(priority = 1)
	public void UserRegistrationSuccisfuly() {
		homeObj = new HomePage(driver);
		homeObj.OpenRegistrationPage();
		userregisterObj = new UserRegistrationPage(driver);
		userregisterObj.UserRegistration(FirstName, "mohy", "3", "5", Email, Passowrd);
	Assert.assertTrue(userregisterObj.passmessage.getText().equals("Your registration completed"));
	}

	@Test(priority = 2)
	public void UserCanLogOut() {
		userregisterObj.UserLogOut();
	}

	@Test(priority = 3)
	public void UserCanLogInSuccees() {
		homeObj.OpenLoginPage();
		loginObj = new LogInPage(driver);
		loginObj.userCanLogIn(Email, Passowrd);
	}

}
