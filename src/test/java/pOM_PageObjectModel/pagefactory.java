package pOM_PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pagefactory {

	
	WebDriver driver = null;
	
	@FindBy(how=How.LINK_TEXT, using ="Log in") WebElement login;
	@FindBy(how=How.ID, using ="Email") WebElement username;
	@FindBy(how=How.NAME, using = "Password") WebElement Password;
	@FindBy(how=How.XPATH, using = "//input[@value='Log in']") WebElement Loginbutton;
	@FindBy(how=How.LINK_TEXT, using = "Log out") WebElement Logout;
	
	public pagefactory(WebDriver Dr) {
		this.driver=Dr;
	}
	
	public void loginmethod(String uid, String pwd){
		login.click();
		username.sendKeys(uid);
		Password.sendKeys(pwd);
		Loginbutton.click();
		Logout.click();
	}
}
