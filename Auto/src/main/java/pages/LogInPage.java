package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends PageBase
{

	public LogInPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="Email") WebElement EmailTxt;
	@FindBy(id="Password") WebElement passwordTxt;
	@FindBy(css="input.button-1.login-button") WebElement LogInButton;
		
	
	public void userCanLogIn (String Email ,String password)
	{
		SetTextElement(EmailTxt, Email);
		SetTextElement(passwordTxt, password);
		ClickButton(LogInButton);

	}

}
