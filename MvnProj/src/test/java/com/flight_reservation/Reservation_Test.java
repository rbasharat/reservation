package com.flight_reservation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Reservation_Test {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  Reservation ui=new Reservation(driver);
	  ui.clickflights();
	  Thread.sleep(3000);
	  ui.click_roundtrip();
	  Thread.sleep(3000);
	  ui.from("Washington, DC (IAD)");
	  Thread.sleep(3000);
	  ui.to("Dubai, United Arab Emirates (DXB-Dubai Intl.)");
	  Thread.sleep(3000);
	  ui.departfield();
	  Thread.sleep(3000);
	  ui.depart_d();
	  Thread.sleep(3000);
	  ui.returnfield();
	  Thread.sleep(3000);
	  ui.return_d();
	  Thread.sleep(3000);
	  ui.serchbutton();
	  
	  
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "/Users/Basharat 1/Documents/Eclipse_docs/Selenium/src/chromedriver");
		driver=new ChromeDriver();
		
		 //driver.navigate().to("https://jqueryui.com/slider/");
		 driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		// driver.manage().deleteAllCookies();
		 driver.navigate().to("https://www.expedia.com");
  }

  @AfterClass
  public void afterClass() {
  }

}
