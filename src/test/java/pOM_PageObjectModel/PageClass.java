package pOM_PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass {

	WebDriver driver = null;
   By lnc = By.linkText("Log in");
   By uname = By.name("email");
   By pass = By.name("Password");
   By Button = By.xpath("//input[@value='Log in']");
   
   public PageClass (WebDriver driver1) {
	   this.driver=driver1;
   }
   
   public void click_lnc() {
	   driver.findElement(lnc).click();
   }
   
   public void type_uname() {
	   driver.findElement(uname).sendKeys("aiswarya.achary@gmail.com");
   }
   
   public void type_password() {
	   driver.findElement(pass).sendKeys("P@ssw0rd1");
   }
   
   public void click_login() {
	   driver.findElement(Button).click();
   }
}
