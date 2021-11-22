package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UniformStore 
{
	// Declaring driver variables
	public WebDriver driver;

	// Finding the locators of WebElements and storing in variables
	By MyAccount=By.xpath("//*[@id=\"footer\"]/div[1]/div[3]/ul/li[1]/a");

	// Defining the constructor
	public UniformStore(WebDriver driver) 
	{
		// Assigning driver to driver variable in this class
		this.driver=driver;
	}

	// Methods to return the location of Web Elements
	public WebElement getMyAccount()
	{
		return driver.findElement(MyAccount);
	}
}
