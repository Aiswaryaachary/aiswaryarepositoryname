package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class withoutdefaultannotations {
  @Test(priority = 1)
  public void Register() {
	  System.out.println("register method");
  }
  
  @Test(priority = 2)
  public void Login() {
	  System.out.println("login method");
	  
	 /* Assert.assertEquals(100, 100);
	  Assert.assertTrue(10>5);
	  Assert.assertFalse(5>10);
	  
	  Assert.assertTrue("aravind".contains("v"));
	  Assert.assertTrue("select".startsWith("Se"));*/
  }
  
  @Test(priority = 3)
  public void LogOut() {
	  System.out.println("logOut method");
  }
  
}
