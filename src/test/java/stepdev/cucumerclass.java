package stepdev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class cucumerclass {
	WebDriver driver = null;
	@Given("the login page is opened")
	public void the_login_page_is_opened() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.25.DIR\\Desktop\\browser_cucumber\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.manage().window().maximize();    // maximise the browser
		  
		  driver.findElement(By.linkText("Log in")).click();
	}

	@When("user enters aiswarya@gmail.com as username")
	public void user_enters_aiswarya_gmail_com_as_username() {
		driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
	}

	@When("user enters aish@{int} as password")
	public void user_enters_aish_as_password(Integer int1) {
		driver.findElement(By.name("Password")).sendKeys("password");
	}

	@Then("user will click on login button")
	public void user_will_click_on_login_button() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}

	@Then("demo webshop home page appears")
	public void demo_webshop_home_page_appears() {
	    System.out.println("title of the page"+driver.getTitle());
	    //Assert.assertTrue(condition, message);
	}
  
}
