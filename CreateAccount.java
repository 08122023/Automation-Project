package LumaProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

public class CreateAccount {
	ExtentSparkReporter report;
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;
 @Parameters("browser")
  @Test
  public void createAcount(String browser) throws IOException, InterruptedException {
	 String path="C:\\Users\\kayala.kumar\\eclipse-workspace\\Junit\\test-output\\Create.html";
	  report=new ExtentSparkReporter(path);
	  extent=new ExtentReports();
     extent.attachReporter(report);
     test=extent.createTest("create title validation");
     test.info("Browsers opening");
	 switch(browser) {
	 case "Chrome Browser":
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\kayala.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 	driver=new ChromeDriver();

	 	break;
	 case "Opera Browser":
		 System.setProperty("webdriver.opera.driver","C:\\Users\\kayala.kumar\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		 driver = new OperaDriver();
	 	break;
	 }
	 	driver.manage().window().maximize();
	 	test.pass("Successfully opened browsers");
	 	//luma web application link
	    test.info("Open the luma web application");
		driver.get("https://magento.softwaretestingboard.com/men.html");
		test.pass("Successfully opened website");
		//create an account module with credential using data driven and apochi poi
		test.info("Open the create account module");
		driver.findElement(By.linkText("Create an Account")).click();
		test.pass("Successfully opened create account module");
		String a=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span")).getText();
		System.out.println(a);
		FileInputStream file= new FileInputStream("C:\\Users\\kayala.kumar\\OneDrive - HCL Technologies Ltd\\Desktop\\Opencart.xlsx");
	    XSSFWorkbook book=new XSSFWorkbook(file);
	    XSSFSheet sheet=book.getSheet("Opencart");
	   int noOfRows=sheet.getLastRowNum();
	    System.out.println("No Of Records in excel sheet: "+noOfRows);
	   for(int row=1; row<=noOfRows; row++) {
	    	XSSFRow current_row=sheet.getRow(row);
	    	
	    	String firstName=current_row.getCell(0).getStringCellValue();
	    	String lastName=current_row.getCell(1).getStringCellValue();
	    	String email=current_row.getCell(2).getStringCellValue();
	    	String password=current_row.getCell(3).getStringCellValue();
	    	String CurrectPassword=current_row.getCell(4).getStringCellValue();
	    	
	    //excel sheet
		driver.findElement(By.id("firstname")).sendKeys(firstName);
		driver.findElement(By.id("lastname")).sendKeys(lastName);
		driver.findElement(By.id("email_address")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("password-confirmation")).sendKeys(CurrectPassword);
		Thread.sleep(100);
		//After create the account it will be clear the details
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("email_address")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password-confirmation")).clear();	
		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();

	   }
	   
	    }
	    
   	      
 @AfterTest
 public void closetest()
 {
     extent.flush();
 }
}