package LumaProject;
import org.junit.Assert; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class AllModules {
	ExtentSparkReporter report;
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;
	@Test
	  public void Start() {
		  String path="C:\\Users\\kayala.kumar\\eclipse-workspace\\Junit\\test-output\\AllModules.html";
		  report=new ExtentSparkReporter(path);
		  extent=new ExtentReports();
	      extent.attachReporter(report);
          test=extent.createTest("Men title validation");
          
	        test.info("Chrome browser opening");
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\kayala.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  	WebDriver driver = new ChromeDriver();
	    driver.get("https://magento.softwaretestingboard.com/men.html");
	    test.pass("Url opened");
	    test.info("Verify the title");
	    String actualtitle="Men Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites";
	    String title = driver.getTitle();
	    Assert.assertEquals(title, actualtitle);
	//
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kayala.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   driver = new ChromeDriver();
	  driver.get("https://magento.softwaretestingboard.com");
	  String title1=driver.getTitle();
	  System.out.println(title1);
	  driver.navigate().to("https://magento.softwaretestingboard.com/men.html");
	  String title2=driver.getTitle();
	  System.out.println(title2);
	  driver.manage().window().maximize();
	  //Tees
	  test.info("open Tees module");
	 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[1]/div[1]/a[1]/span/img")).click();
	 String e=driver.getTitle();
	 System.out.println(e);
	 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img")).click();
	 String f=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
	 System.out.println(f);
	 driver.navigate().back();
	  /*//create account
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/div[2]/div/div/a")).click();
	  driver.findElement(By.id("firstname")).sendKeys("sukumar");
	  driver.findElement(By.id("lastname")).sendKeys("pushpa");
	  driver.findElement(By.name("is_subscribed")).click();
	  driver.findElement(By.name("email")).sendKeys("sukumar@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("sukumar@12345");
	  driver.findElement(By.id("password-confirmation")).sendKeys("sukumar@12345");
	  driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();
	  driver.navigate().back();
	  driver.navigate().back();*/
	  //login module
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img")).click();
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[5]/div/a[1]/span")).click();
	  driver.findElement(By.id("email")).sendKeys("sukumar@gmail.com");
	  driver.findElement(By.name("login[password]")).sendKeys("sukumar@12345");
	  driver.findElement(By.id("send2")).click();
	  driver.navigate().to("https://magento.softwaretestingboard.com/men.html");
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[1]/div[1]/a[1]/span/img")).click();
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/a/span/span/img")).click();
	  String g=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
	  System.out.println(g);
	  driver.navigate().back();
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[3]/div/a/span/span/img")).click();
	  String h=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
	  System.out.println(h);
	  driver.navigate().back();
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[4]/div/a/span/span/img")).click();
	  String i=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
	  System.out.println(i);
	  driver.navigate().back();
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[5]/div/a/span/span/img")).click();
	  String j=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
	  System.out.println(j);
	  driver.navigate().back();
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[6]/div/a/span/span/img")).click();
	  String k=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
	  System.out.println(k);
	  driver.navigate().back();
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[7]/div/a/span/span/img")).click();
	  String l=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
	  System.out.println(l);
	  driver.navigate().back();
	  driver.navigate().back();
	  //pants module
	  test.info("open pants module");
	 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[1]/div[1]/a[2]/img")).click();
	 String sa=driver.findElement(By.xpath("//*[@id=\"page-title-heading\"]/span")).getText();
	 System.out.println("Name of the Module: "+sa);
	 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img")).click();
	 String ab= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
	 System.out.println(ab);
	 driver.navigate().back();
	 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/a/span/span/img")).click();
	 String cd= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
	 System.out.println(cd);
	 driver.navigate().back();
	 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[3]/div/a/span/span/img")).click();
	 String ef= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
	 System.out.println(ef);
	 driver.navigate().back();
	 driver.navigate().back();
	  //Shorts module
	 test.info("open Shorts module");
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
	  String sb=driver.findElement(By.xpath("//*[@id=\"page-title-heading\"]/span")).getText();
	  System.out.println("Name of the Module: "+sb);
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img")).click();
		 String gh= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
		 System.out.println(gh);
		 driver.navigate().back();
		 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/a/span/span/img")).click();
		 String ij= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
		 System.out.println(ij);
		 driver.navigate().back();
		 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[3]/div/a/span/span/img")).click();
		 String kl= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
		 System.out.println(kl);
		 driver.navigate().back();
		 driver.navigate().back();
	  //Tees module
		 test.info("open Tees module");
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[1]/div[2]/a[2]")).click();
	  String sc=driver.findElement(By.xpath("//*[@id=\"page-title-heading\"]/span")).getText();
	  System.out.println("Name of the Module: "+sc);
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img")).click();
		 String mn= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
		 System.out.println(mn);
		 driver.navigate().back();
		 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/a/span/span/img")).click();
		 String op= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
		 System.out.println(op);
		 driver.navigate().back();
		 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[3]/div/a/span/span/img")).click();
		 String qr= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
		 System.out.println(qr);
		 driver.navigate().back();
		 driver.navigate().back();
	  //Hoodies & Sweatshirts module
		 test.info("open Hoodies & Sweatshirts module");
		 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		 String sd=driver.findElement(By.xpath("//*[@id=\"page-title-heading\"]/span")).getText();
		  System.out.println("Name of the Module: "+sd);
		 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img")).click();
		 String st= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
		 System.out.println(st);
		 driver.navigate().back();
		 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/a/span/span/img")).click();
		 String uv= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
		 System.out.println(uv);
		 driver.navigate().back();
		 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[3]/div/a/span/span/img")).click();
		 String wx= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
		 System.out.println(wx);
		 driver.navigate().back();
		 driver.navigate().back();
	 //Hot Sellers module
		 test.info("open Hot Sellers module");
		 String se=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[2]/h2")).getText();
		  System.out.println("Name of the Module: "+se);
	  driver.findElement(By.linkText("Argus All-Weather Tank")).click();
	 String b=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
	  System.out.println(b);
	  driver.navigate().back();
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/a/span/span/img")).click();
	  String c=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
	  System.out.println(c);
	  driver.navigate().back();
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[3]/div/a/span/span/img")).click();
	  String ra=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
	  System.out.println(ra);
	  driver.navigate().back();
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[4]/div/a/span/span/img")).click();
	  String rj=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span")).getText();
	  System.out.println(rj);
	  driver.navigate().back();
	  driver.close();
  }
  @AfterTest
  public void closetest()
  {
      extent.flush();
  }
}