package Fullwebsitecode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepageautomation {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();

		driver.get("https://www.itlearn360.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// maximize window
		driver.manage().window().maximize();

		driver.findElement(By.id("loginlabel")).click();//loginbutton
		driver.findElement(By.id("user_login")).sendKeys("lamxim");//username
		driver.findElement(By.id("user_pass")).sendKeys("Abcdefgh1234");//password
		driver.findElement(By.id("wp-submit")).click();//submit
		//using locators to navigate links
		// Locate Face book icons using className locator and perform click
		driver.findElement(By.className("fa-facebook")).click();
		// Thread.sleep(1000);
		// Navigate back on main page using navigate and back method
		driver.navigate().back();
		// Locate twitter icons using className locator and perform click
		driver.findElement(By.className("fa-twitter")).click();
		// Thread.sleep(1000);
		// Navigate back on main page using navigate and back method
		driver.navigate().back();
		// Locate social site icons using className locator and perform click
		driver.findElement(By.className("fa-instagram")).click();
		// Navigate back on main page using navigate and back method
		driver.navigate().back();
		// Thread.sleep(1000);
		// Locate you tube icons using className locator and perform click
		driver.findElement(By.className("fa-youtube")).click();
		// Navigate back on main page using navigate and back method
		driver.navigate().back();
		// Thread.sleep(1000);
		// 12. Locate linkedIn icons using className locator and perform click
		driver.findElement(By.className("fa-linkedin")).click();
		// 13. Navigate back on main page using navigate and back method
		driver.navigate().back();
		// 14. Close the browser
		

		// performing clicking on all courses
		driver.findElement(By.linkText("All Courses")).click();
		// Thread.sleep(1000);
		// driver.navigate().to("https://www.itlearn360.com/");
		
		// performing click on jobs

		 driver.findElement(By.linkText("Jobs")).click();
		// Thread.sleep(1000);
        driver.navigate().to("https://www.itlearn360.com/");

		// open the get started page

		driver.findElement(By.className("lg_button")).click();
//		Thread.sleep(1000);
		driver.navigate().to("https://www.itlearn360.com/");

		// click on blog link
		driver.findElement(By.linkText("Blog")).click();
//		Thread.sleep(1000);
		driver.navigate().to("https://www.itlearn360.com/");

		// performing click on free courses
		driver.findElement(By.id("menu-item-13318")).click();
//		Thread.sleep(1000);
		driver.navigate().to("https://www.itlearn360.com/");
//
		// performing online classes
		driver.findElement(By.linkText("Online Classes")).click();
//		Thread.sleep(1000);
		driver.navigate().to("https://www.itlearn360.com/");

		// search Button
		driver.findElement(By.id("search_course")).sendKeys("automation selenium webdriver");
		// Thread.sleep(1000);
		driver.navigate().to("https://www.itlearn360.com/");
		Thread.sleep(1000);

	}

}





