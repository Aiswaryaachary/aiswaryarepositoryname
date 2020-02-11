package stepdev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register {
	WebDriver driver = null;
	@Given("the Register page is opened")
	public void the_Register_page_is_opened() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.25.DIR\\Desktop\\browser_cucumber\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.manage().window().maximize();    // maximise the browser
		  
		  driver.findElement(By.linkText("Register")).click();
	}

	@When("user enters the gender")
	public void user_enters_the_gender() {
	    driver.findElement(By.xpath("//input[@id='gender-female']")).click();
	}

	@When("user enters first name")
	public void user_enters_first_name() {
	   driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("aiswarya");
	}

	@When("user enters last name")
	public void user_enters_last_name() {
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("achary");
	}

	@When("user enters email")
	public void user_enters_email() {
	    driver.findElement(By.xpath("//input[@id='Email' and @type='text']")).sendKeys("aiswarya.achary@gmail.com");
	}

	@When("user enters password")
	public void user_enters_password() {
	    driver.findElement(By.xpath("//input[@id='Password' and @name='Password']")).sendKeys("P@ssw0rd1");
	}

	@When("user enters confirm password")
	public void user_enters_confirm_password() {
		driver.findElement(By.xpath("//input[@id='ConfirmPassword' and @name='ConfirmPassword']")).sendKeys("P@ssw0rd1");
	}

	@Then("user will click on Register button")
	public void user_will_click_on_Register_button() {
	    driver.findElement(By.xpath("//input[@type='submit' and @value='Register']")).click();
	}

	@Then("user will ve registered")
	public void user_will_ve_registered() {
	    System.out.println("!!registered");
	}
}
