package testes;

import org.testng.Assert;

import pages.HomePage;
import pages.LogInPage;
import pages.UserRegistrationPage;

public class UserRegistrationJason extends TestBase

{
	{
		
	HomePage homeObj;
	UserRegistrationPage userregisterObj;
	LogInPage loginObj;
	homeObj = new HomePage(driver);
	homeObj.OpenRegistrationPage();
	userregisterObj = new UserRegistrationPage(driver);
	userregisterObj.UserRegistration("koko", "mohy", "3", "5", "ahmed@live.com", "123456789");
    Assert.assertTrue(userregisterObj.passmessage.getText().equals("Your registration completed"));
	userregisterObj.UserLogOut();
	homeObj.OpenLoginPage();
	loginObj = new LogInPage(driver);
	loginObj.userCanLogIn("zaza","ahmed@hotmail.com");
	userregisterObj.UserLogOut();

	

}

}
