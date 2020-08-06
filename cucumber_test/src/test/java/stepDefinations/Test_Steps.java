package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Test_Steps {
		public static WebDriver driver;
		
		
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\softwares\\eckodriver.exe");
		
		//driver = new FirefoxDriver();
		 System.setProperty("webdriver.chrome.driver", "C:\\Project Work\\chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		//driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		
		System.out.println("web page now open");
	}

	@And("^User enters \"(.*)\" and \"(.*)\"$")	
	public void user_enters_UserName_and_Password(String string1, String string2) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(string1); 	 
	    driver.findElement(By.id("pass")).sendKeys(string2);
	    driver.findElement(By.id("loginbutton")).click();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		//driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		System.out.println("LogOut Successfully");
	}
}