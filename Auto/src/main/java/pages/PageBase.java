package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase 
{
	protected WebDriver driver;

	public PageBase(WebDriver driver)
	{PageFactory.initElements(driver, this); }

	protected static void ClickButton ( WebElement Button ) 
	{ 
		Button.click(); 
	}
	protected static void SetTextElement ( WebElement TextElement , String Value)
	{
		TextElement.sendKeys(Value);
	}

	public static void SelectDropDown(WebElement DropDown , String Value)
	{
		Select element = new Select(DropDown);
		element.selectByValue(Value);

	}
}
