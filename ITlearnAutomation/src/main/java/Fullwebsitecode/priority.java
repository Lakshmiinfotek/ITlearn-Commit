package Fullwebsitecode;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


	

	public class priority {
		WebDriver driver;

	@Test(priority =0)
	//opening web site using wait and maximize 
	public void openingwebsite () {
		  driver.get("https://www.itlearn360.com/");
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			
		  driver.manage().window().maximize();
		  System.out.println("priority = 0");
		  
	}
	//login credentials and give the priority 1
	@Test(priority=1)
	public void logincredentials() {

			driver.findElement(By.id("loginlabel")).click();//login and click
			driver.findElement(By.id("user_login")).sendKeys("lamxim");//username and send values
			driver.findElement(By.id("user_pass")).sendKeys("Abcdefgh1234");//password send values
			
	    System.out.println("priority = 1");
	}
	@Test(priority=2)//submit loginbutton and navigate to homepage
	public void submitloginbutton() {
		  driver.findElement(By.name("wp-submit")).submit();
		  driver.navigate().to("https://www.itlearn360.com/");
		  
	}
	@Test(priority=3)//priority is for navigating links and back to homepage
	public void navigatinglinks() throws InterruptedException {
	driver.findElement(By.className("fa-facebook")).click();//facebook
	driver.navigate().back();
	driver.findElement(By.className("fa-twitter")).click();//twitter
	driver.navigate().back();
	driver.findElement(By.className("fa-instagram")).click();//instagram
	driver.navigate().back();
	driver.findElement(By.className("fa-youtube")).click();//you tube
	driver.navigate().back();
	driver.findElement(By.className("fa-linkedin")).click();//link den
	driver.navigate().to("https://www.itlearn360.com");
	Thread.sleep(1000);
	}
	@Test(priority=4)//home page elements 
	public void chekingelements() {
			
		  driver.findElement(By.linkText("Jobs")).click();
		  driver.navigate().to("https://www.itlearn360.com/");
		  
		  driver.findElement(By.className("lg_button")).click();
		  driver.navigate().to("https://www.itlearn360.com/");
		  
		  driver.findElement(By.linkText("Blog")).click();
		  driver.navigate().to("https://www.itlearn360.com/");
		  
		  driver.findElement(By.id("menu-item-13318")).click();
		  driver.navigate().to("https://www.itlearn360.com/");
		  
		  driver.findElement(By.linkText("Online Classes")).click();
			driver.navigate().to("https://www.itlearn360.com/");
	}


	@BeforeTest//before test 
	public void performingbeforetest() {
		  System.setProperty("webdriver.chrome.driver","c:\\Program Files\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
		  
	}
	@AfterTest // after test
	public void performingaftertest() {
		  driver.close();
	}


	}













