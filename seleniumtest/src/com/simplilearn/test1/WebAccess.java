package com.simplilearn.test1;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

public class WebAccess {
	
	/*1. load the driver of the browser
	 *2. set the build path with all the jar files,create an object for the webdriver
	 *3.maximise the web browser screen
	 *4.specify the webpage what u want to tests
	 *5.access the web components over the webpage
	 * */
	
		public static void main(String[] args) throws InterruptedException  {
		//load the driver
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishw\\OneDrive\\Desktop\\my desktop\\selenium\\95\\chrome\\chromedriver.exe");
			WebDriver wd=(WebDriver) new ChromeDriver();
		//maximise the web browser screen
			wd.manage().window().maximize();
		//load the webpage
			wd.get("https://www.amazon.in/");
	//title of webpage what loaded
			System.out.println(wd.getTitle());
	//load the url
			System.out.println(wd.getCurrentUrl());
			//close the browser
			try {
			
			wd.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung");
	        wd.findElement(By.id("nav-search-submit-button")).click();
			
			//wd.findElement(By.linkText("Start here.")).click();
			//wd.findElement(By.id("ap_customer_name")).sendKeys("Vishakha");
			//wd.findElement(By.id("ap_phone_number")).sendKeys("1234567890");
			//wd.findElement(By.id("ap_email")).sendKeys("abc123@gmail.com");
			//wd.findElement(By.id("ap_password")).sendKeys("1234567");
			//wd.findElement(By.id("continue")).click();
			}catch(NoSuchElementException e) {
				System.out.println("Handled NoSuchElementException");
			}
			
			
			
			
			Thread.sleep(1000);
			
			
		}
	
}

