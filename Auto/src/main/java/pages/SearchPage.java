package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase
{

	public SearchPage(WebDriver driver) {
		super(driver);
 	}

	
	@FindBy(id="small-searchterms") WebElement SearchTxtBox;
	@FindBy(css="input.button-1.search-box-button") WebElement SearchButton;
	
	public void SearchProduct(String ProductName)
	{
		SetTextElement(SearchTxtBox, ProductName);
		ClickButton(SearchButton);
	}
}
