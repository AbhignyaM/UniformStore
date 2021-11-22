package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.Login;
import pageObjects.UniformStore;
import pageObjects.NavigationBar;

import resources.Base;

public class StepDefinitions extends Base
{
	// Navigates to our website
	@Given("^Navigating to the website$")
	public void navigate_to_the_website() throws Throwable  
	{
		//initalizing the browser
		driver =initializeDriver();

		// Maximizing the window
		driver.manage().window().maximize();

		//navigating to the uniform store with this URL
		driver.get("http://uniformm1.upskills.in/");

	}

	// Logging in with the given username and password
	@And("^Login with (.+) and (.+)$")
	public void login_with_and(String username, String password) throws IOException, InterruptedException
	{
		// Creating an object for login class
		Login l=new Login(driver);

		// To click on the user icon
		l.getDropdown().click();

		// To click on login option in the drop down
		l.getLogin().click();

		// To get the email and password
		l.getEmail().sendKeys(username);
		l.getPassword().sendKeys(password);

		// To click on submit button
		l.getSubmit().click();

		// Specifiyng implicit wait
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
	}

	// To click on MyAccount after logging in.
	@When("Click on MyAccount")
	public void click_on_my_account()
	{
		System.out.println("hii");

		// To click on MyAccount option if the login is success
		driver.findElement(By.xpath("//h5[text()='My Account']"));

		// Creating an object
		UniformStore u=new UniformStore(driver);
		u.getMyAccount().click();
	}

	// To navigate to the MyAccount Page.
	@Then("Navigate to MyAccount page")
	public void navigate_to_my_account_page()
	{
		driver.findElement(By.xpath("//h2[text()='My Account']")).getText();
		System.out.println("true");
		driver.close();
	}
	// End of login page Scenario

	// Beginning of the Navigation Bar Scenario

	// Navigating to the website
	@Given("Navigating to  website")
	public void navigate_to_website() throws IOException 
	{
		//initalizing the browser
		driver =initializeDriver();

		// Maximizing the window
		driver.manage().window().maximize();

		//navigating to the uniform store with this URL
		driver.get("http://uniformm1.upskills.in/");

	}

	// Logging in with a username and password
	@When("Login with your credentials")
	public void login_with_your_credentials() throws InterruptedException 
	{
		// Creating an object for login class
		Login l=new Login(driver);

		// To click on the user icon
		l.getDropdown().click();

		// To click on login option in the drop down
		l.getLogin().click();
		
		// Login with the email and password
		l.getEmail().sendKeys("abhignya7@gmail.com");
		l.getPassword().sendKeys("Abhignya123");
		
		// To click on submit button
		l.getSubmit().click();
		
		// Specifiyng implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
	}

	@Then("Explore all the options")
	public void explore_all_the_options() throws InterruptedException
	{
		// Creating a constructor
		NavigationBar n= new NavigationBar(driver);

		// To click on the Uniform store logo in the Navigation Bar
		n.getLogo().click();
		driver.findElement(By.xpath("//*[@class='tp-rightarrow tparrows round']")).click();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		System.out.println("Clicking on the logo");
		

		// To click on the home screen option in the Navigation Bar
		n.getMenu().click();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		System.out.println("----ERROR!!----");

		// To click on the cart option in the Navigation Bar
		n.getCart().click();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		System.out.println("Clicking on the my Cart option");

		// To click on the wishlist option in the Navigation Bar
		n.getWishlist().click();
		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);

		// To click on the user icon in the Navigation Bar
		n.getUser().click();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Logout")).click();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		System.out.println("Clicking on the user option");



		//				driver.findElement(By.xpath("//*[@id='logo']")).click();
		//				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//				driver.findElement(By.xpath("//*[@id='menu']")).click();
		//				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//				driver.findElement(By.xpath("//*[@id='cart']")).click();
		//				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//				driver.findElement(By.xpath("//*[@id='wishlist-total']")).click();
		//				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//				driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//				driver.findElement(By.xpath("//*[@class='fa fa-user']")).click();
		//				Thread.sleep(1000);

	}
	
	// To close the browser
	@Then("Close the browser")
	public void close_the_browser() 
	{
		driver.close();
		System.out.println("Close the browser");
	}


}