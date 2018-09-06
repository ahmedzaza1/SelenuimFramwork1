package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends PageBase
{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText="Register") WebElement RegisterLink;
	@FindBy(linkText="Log in") WebElement LogInLink;
	@FindBy(linkText="My account")WebElement MyAccountLink;
	@FindBy(linkText="Change password") WebElement ChangePasswordLink;


	public void OpenRegistrationPage()
	{
		ClickButton(RegisterLink);
	}
	public void OpenLoginPage()

	{
		ClickButton(LogInLink);
	}
	public void OpenMyAccount()
	{
		ClickButton(MyAccountLink);
	}
	public void OpenChangePassword()
	{
		ClickButton(ChangePasswordLink);
	}



}
