package com.whatsapp;

//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;


public class WhatsappRegression {

	WebDriver driver;
	
	/*
	@BeforeTest
	  public void setup() {
		  
		  //String appUrl = "http://www.shopstyle.com/page/NewsletterSignUp";	
		  //driver.get(appUrl);
		  //driver.manage().window().maximize();
		  //driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  }
*/
	
	@Test
	public void testApp()  throws IOException, MalformedURLException{
		
		File app = new File("E:\\Dropbox\\Downloads\\WhatsApp.apk");
		System.out.println("Launching App");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.2");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S5");
		//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		///capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		  capabilities.setCapability("app", app.getAbsolutePath());
		  capabilities.setCapability("appPackage", "com.whatsapp");
		  capabilities.setCapability("appActivity", "com.whatsapp.Main");
		
		//ChromeOptions options = new ChromeOptions();
		//options.setExperimentalOption("androidPackage", "com.android.chrome");
		//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		//WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
		//driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//driver.get("www.google.com/ncr");
  }
	
	
	 @AfterTest
	  public void teardown() {
		  driver.quit();
	      //driver.close();
		  System.out.println("Finished the tests successfully");
	  }

	}
