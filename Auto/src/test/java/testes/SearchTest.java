package testes;

import org.testng.annotations.Test;

import pages.SearchPage;

public class SearchTest extends TestBase
{

	SearchPage searchObj;
	String ProductName="Apple MacBook Pro 13-inch";
	
	@Test
	public void SearchProductName()
	{
		searchObj = new SearchPage(driver);
		searchObj.SearchProduct(ProductName);
		
	}
	
}
