package Fullwebsitecode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprov {
	WebDriver driver;
	   @Test(dataProvider = "dp")
	    public void checking(String userName, String passWord, String msg) throws InterruptedException {
	    	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	    	 		driver = new ChromeDriver();
	    	 		driver.get("https://www.itlearn360.com");
	    	 		driver.manage().window().maximize();
	    	 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	 		driver.findElement(By.id("loginlabel")).click();
	    	 		driver.findElement(By.id("user_login")).sendKeys("username");
	    			driver.findElement(By.id("user_pass")).sendKeys("password");
	    			driver.findElement(By.id("wp-submit")).click();
	    			 System.out.println("End Result: Form submitted");
	    		        Thread.sleep(2000);
	    		    }
	    		    @DataProvider
	    		    public Object[][] dp() {
	    		        return new Object[][] { 
	    		            new Object[] { "lamx", "1234" ,"Wrong Credentials"}, 
	    		            new Object[] { "lamxim", "Abcdefgh123"," Credentials" },
	    		            new Object[] { "lamxim", "Abcdefgh1234","Test Passed" },
	    		        };
	    		    }
	

}


