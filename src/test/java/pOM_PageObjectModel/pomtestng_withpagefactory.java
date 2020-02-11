package pOM_PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pomtestng_withpagefactory {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.25.DIR\\Desktop\\browser_cucumber\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		pagefactory PF = PageFactory.initElements(driver, pagefactory.class);
		PF.loginmethod("aiswarya.achary@gmail.com", "P@ssw0rd1");
		driver.close();
  }
}
