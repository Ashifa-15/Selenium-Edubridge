package Selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestNg_App {
	WebDriver dri= new ChromeDriver();	
@BeforeSuite
	public void beforeSuite() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","F:/EDUBRIDGE/chromedriver/chromedriver-win64/chromedriver.exe");
		Thread.sleep(1000);
		
        String openurl="http://www.amazon.in/";
		dri.get(openurl);
}

@BeforeMethod
	public void beforeMethod() {
		String title = dri.getTitle();
		System.out.println("Printing Title: "+  title);
}

@BeforeClass
public void beforeClass(){
	String url= dri.getCurrentUrl();
	System.out.println("Current Url: "+ url);
}

@AfterClass		
public void afterClass(){		
		dri.findElement(By.id("twotabsearchtextbox")). sendKeys("Kurta");
		dri.findElement(By.id("nav-search-submit-button")). click();
		dri.findElement(By.className("a-section a-spacing-base a-text-center")). click();
}
}
