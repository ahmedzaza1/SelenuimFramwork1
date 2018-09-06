package testes;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LogInPage;
import pages.MyAccountPage;
import pages.UserRegistrationPage;

public class MyAccountTest extends TestBase
{ 

	HomePage homeObj;
	UserRegistrationPage userregisterObj;
	MyAccountPage myaccountObj;
	LogInPage loginObj;
	String FirstName="ahmed";
	String Email="ahmedko@hotmail.com";
	String LastName="mansy";
	String Passowrd="kikioooo";
	String OldPassword="kikioooo";
	String NewPassword="policeman";

	@Test(priority=1)
	public void UserRegistrationSuccisfuly()
	{
		homeObj = new HomePage(driver);
		homeObj.OpenRegistrationPage();
		userregisterObj = new UserRegistrationPage(driver);
		userregisterObj.UserRegistration(FirstName, LastName , "5", "6",Email,OldPassword);	
		Assert.assertTrue(userregisterObj.passmessage.getText().equals("Your registration completed"));
	}

	@Test(priority=2)
	public void UserCanChangePassword()
	{
		myaccountObj = new MyAccountPage(driver);
		homeObj.OpenMyAccount();
		homeObj.OpenChangePassword();
		myaccountObj.ChangePassword(OldPassword, NewPassword);
		
	}
	@Test(priority=3)
	public void UserCanLogOut()
	{
		userregisterObj.UserLogOut();
	}

	@Test(priority=4)
	public void UserCanLogInSuccees()
	{
		homeObj.OpenLoginPage();
		loginObj = new LogInPage(driver);
		loginObj.userCanLogIn(Email,NewPassword);
	}

}
