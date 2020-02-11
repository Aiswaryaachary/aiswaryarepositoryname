package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo3 {
	
	WebDriver driver = null;
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.25.DIR\\Desktop\\browser_cucumber\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();    // maximise the browser
	  
	 // driver.findElement(By.linkText("Log in")).click();
	 // driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
	 // driver.findElement(By.name("Password")).sendKeys("password");
	 // driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	 // driver.findElement(By.linkText("Forgot password?")).click();
	  
	  
	  driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("selenium");
	  driver.findElement(By.xpath("//input[@value='Search' and @type='submit']")).click(); 
  }
}

