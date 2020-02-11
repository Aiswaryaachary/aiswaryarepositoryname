package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class demo1_TestNG {
  @Test
  public void f() {
	  System.out.println("this is test");
  }
  
  @Test
  public void f1() {
	  System.out.println("this is test11111111");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is beforesuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is aftersuite");
  }

}
