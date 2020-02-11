package pOM_PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


// without page factory
public class TestcasePageclass {

	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.25.DIR\\Desktop\\browser_cucumber\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize(); 
		
		PageClass project = new PageClass(driver);   //creating object of PageClass class
		
		project.click_lnc();
		project.type_uname();
		project.type_password();
		project.click_login();
	}
}
