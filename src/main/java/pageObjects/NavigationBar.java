package pageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationBar 
{
	// Declaring driver variables
	public WebDriver driver;

	// Finding the locators of WebElements and storing in variables
	By Logo=By.xpath("//*[@id='logo']");

	By Menu=By.xpath("//*[@id='menu']");

	By Cart=By.xpath("//*[@id='cart']");

	By Wishlist=By.xpath("//*[@id='wishlist-total']");

	By User=By.xpath("//*[@class='fa fa-user']");

	// Defining the constructor
	public NavigationBar(WebDriver driver2) 
	{
		// Assigning driver to driver variable in this class
		this.driver=driver2;

	}

	// Methods to return the location of Web Elements
	public void NavigationBar(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getLogo()
	{
		return driver.findElement(Logo);
	}

	public WebElement getMenu()
	{
		return driver.findElement(Menu);
	}
	public WebElement getCart()
	{
		return driver.findElement(Cart);
	}
	public WebElement getWishlist()
	{
		return driver.findElement(Wishlist);
	}
	public WebElement getUser()
	{
		return driver.findElement(User);
	}
}
