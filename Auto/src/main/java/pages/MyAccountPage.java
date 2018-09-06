package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase
{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(id="OldPassword") WebElement OldPasswordTxt;
	@FindBy(id="NewPassword")WebElement NewPssowrdTxt; 
	@FindBy(id="ConfirmNewPassword")WebElement ConfirmPassword;
	@FindBy(css="input.button-1.change-password-button") WebElement ChangePasswordButton;
    @FindBy(css="div.result") public WebElement ResultChangePassord;


	public void ChangePassword(String OldPass , String NewPass )
	{

		SetTextElement(OldPasswordTxt, OldPass);
		SetTextElement(NewPssowrdTxt, NewPass);
		SetTextElement(ConfirmPassword, NewPass);
		ClickButton(ChangePasswordButton);
	}
}
