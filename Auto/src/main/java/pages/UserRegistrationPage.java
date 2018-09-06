package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase {

	public UserRegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="gender-male") WebElement FemalBtn;
	@FindBy(id="FirstName") WebElement FirstNameTxt;
	@FindBy(id="LastName") WebElement LastNameTxt;
	@FindBy(name="DateOfBirthDay") WebElement BdayDropDown;
	@FindBy(name="DateOfBirthMonth") WebElement MonthDropDown;
	@FindBy(id="Email") WebElement EmailTxt;
	@FindBy(id="Password") WebElement passwordTxt;
	@FindBy(id="ConfirmPassword") WebElement ConfirmpassTxt;
	@FindBy(id="register-button") WebElement RegistrationBtn;
	@FindBy(css="div.result") public  WebElement passmessage;
	@FindBy(linkText=("Log out"))public  WebElement LogOutLink;
 

	public void UserRegistration(String FirstName , String LastName, String Bday ,String MonthBday,String  Emailtext, String password)
	{
		ClickButton(FemalBtn);
		SetTextElement(FirstNameTxt, FirstName);
		SetTextElement(LastNameTxt, LastName);
		SelectDropDown(BdayDropDown, Bday);
		SelectDropDown(MonthDropDown, MonthBday);
		SetTextElement(EmailTxt, Emailtext);
		SetTextElement(passwordTxt, password);
		SetTextElement(ConfirmpassTxt, password);
		ClickButton(RegistrationBtn);


	}
	public void UserLogOut()
	{
       ClickButton(LogOutLink);
	}
	 
   

}
