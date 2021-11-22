package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login 
{
	// Declaring driver variables
	public WebDriver driver;

	// Finding the locators of WebElements and storing in variables
	By Dropdown=By.xpath("//*[@class='fa fa-user']");
	By Login=By.xpath("//a[text()='Login']");
	By Email=By.xpath("//*[@name='email']");
	By Password=By.xpath("//*[@name='password']");
	By Submit=By.xpath("//*[@type='submit']");

	// Defining the constructor
	public Login(WebDriver driver) 
	{
		// Assigning driver to driver variable in this class
		this.driver=driver;
	}

	// Methods to return the location of Web Elements
	public WebElement getDropdown()
	{
		return driver.findElement(Dropdown);
	}
	public WebElement getLogin()
	{
		return driver.findElement(Login);
	}
	public WebElement getEmail()
	{
		return driver.findElement(Email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(Submit);
	}

}
