package stepdev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutline {

	WebDriver driver = null;
	
		
		  @Given("User will open the application")
			public void user_will_open_the_application() {  
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.25.DIR\\Desktop\\browser_cucumber\\chromedriver_win32 (1)\\chromedriver.exe");
			  driver = new ChromeDriver();
			 // driver.get("http://demowebshop.tricentis.com/");
			  driver.get("http://demowebshop.tricentis.com/login");
			  driver.manage().window().maximize();    // maximise the browser
	}
		  
	@When("User clicks on signin link")
	public void user_clicks_on_signin_link() {
		  driver.findElement(By.linkText("Log in")).click();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String name, String pass) {
		driver.findElement(By.id("Email")).sendKeys(name);
		driver.findElement(By.name("Password")).sendKeys(pass);
	}

	@Then("User will click on login button")
	public void user_will_click_on_login_button() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}

	@Then("Demo Webshop home page will display")
	public void demo_Webshop_home_page_will_display() {
	    System.out.println("failed!!");
	}
}
