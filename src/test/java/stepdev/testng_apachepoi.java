package stepdev;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testng_apachepoi {
  @Test
  public void f() throws IOException {

  File src = new File("C:\\Users\\a07208trng_b4b.04.25.DIR\\Desktop\\SampleData.xlsx");
  
  File src1 = new File("C:\\Users\\a07208trng_b4b.04.25.DIR\\Desktop\\qqq\\");
  FileInputStream fis = new FileInputStream(src);
  XSSFWorkbook wb = new XSSFWorkbook(fis);
  XSSFSheet sh =wb.getSheetAt(0);
//  System.out.println("1st row no:"+sh.getFirstRowNum());
//  System.out.println("last row no:"+sh.getLastRowNum());
//  
//  int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
//  int noofcolumns=sh.getRow(0).getPhysicalNumberOfCells();
//  
//  System.out.println("row count is "+rowCount);
//  System.out.println("no of columns is "+noofcolumns);
//  
//  
//  for(int i=1;i<=rowCount; i++) {
//	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.25.DIR\\Desktop\\browser_cucumber\\chromedriver_win32 (1)\\chromedriver.exe");
//	  WebDriver driver = new ChromeDriver();
//	  driver.get("http://demowebshop.tricentis.com/");
//	  driver.manage().window().maximize();    // maximise the browser
//	  
//	  driver.findElement(By.linkText("Log in")).click();
//	  driver.findElement(By.id("Email")).sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
//	  driver.findElement(By.name("Password")).sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
//	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
//	  driver.quit();
//  }
//	  
	  //writing back to excel
	  
	  XSSFRow header = sh.getRow(0);
	  XSSFCell head =header.createCell(2);
	  head.setCellValue("Status");
	  sh.getRow(1).createCell(2).setCellValue("PASS");
	  sh.getRow(2).createCell(2).setCellValue("FAIL");
	  
	  FileOutputStream fos = new FileOutputStream(src1);
	  wb.write(fos);
	  
	  
	  
	
  
  
  
  //System.out.println(sh.getRow(0).getCell(0).getStringCellValue()+"\t\t\t"+sh.getRow(0).getCell(1).getStringCellValue());
  //System.out.println(sh.getRow(1).getCell(0).getStringCellValue()+"\t\t\t"+sh.getRow(1).getCell(1).getStringCellValue());
  }
  
 
}
