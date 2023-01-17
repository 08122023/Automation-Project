package LumaProject;

import java.io.FileInputStream;  
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Products {
	//Here using Extent report 
	ExtentSparkReporter report;
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;	
	int row=5;
  @Test
  public void produts() throws IOException {
	  String path="C:\\Users\\kayala.kumar\\eclipse-workspace\\Junit\\test-outputt\\product.html";
	  report=new ExtentSparkReporter(path);
	  extent=new ExtentReports();
     extent.attachReporter(report);
     test=extent.createTest("Men title validation");
     test.info("Chrome Browsers opening");
	  //Browser open path
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\kayala.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		test.pass("Successfully opened chrome browser");
	  driver=new ChromeDriver();
		driver.manage().window().maximize();
	//luma web application link
		test.info("Open the luma website");
		driver.get("https://magento.softwaretestingboard.com/men.html");
		test.pass("Successfully opened website");
	//what's new module
		test.info("Open the what's new module");
	driver.navigate().to("https://magento.softwaretestingboard.com/what-is-new.html");
	test.info("Successfully opened what's new module");
	driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/a/span/span/img")).click();  
	String d=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
	System.out.println(d);
	//login account
	driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[5]/div/a[1]/span")).click();
	driver.findElement(By.id("email")).sendKeys("sukumar@gmail.com");
	driver.findElement(By.name("login[password]")).sendKeys("sukumar@12345");
	driver.findElement(By.id("send2")).click();
   //add to compare
	driver.navigate().to("https://magento.softwaretestingboard.com");
	driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[4]/div/a/span/span/img")).click();  
	driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[5]/div/a[2]/span")).click();
    //add to cart
	driver.navigate().to("https://magento.softwaretestingboard.com");
	driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[5]/div/a/span/span/img")).click();
	driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
    
	
  } 
  @AfterTest
  public void closetest()
  {
      extent.flush();
  }
}
