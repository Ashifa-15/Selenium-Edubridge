package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Check {
	public static void main (String args[]) throws InterruptedException {
		System.setProperty("webdriver.Chrome driver", "F:/EDUBRIDGE/chromedriver/chromedriver-win64/chromedriver.exe");
		WebDriver dri = new ChromeDriver();
	    dri.get("https://demoqa.com/radio-button");
	    //dri.findElement(By.xpath("//label[@class='custom-control-label']")).click();
	    WebElement radio = dri.findElement(By.xpath("//label[@class='custom-control-label']"));
	    boolean isSelected =radio.isSelected();
	    System.out.println(radio.isSelected());
	    if(isSelected) {
	    	System.out.println("Already Clicked");		
	    }
	    else {
	    	//dri.findElement(By.xpath("//label[@class='custom-control-label']")).click();
	    	System.out.println("Not Clicked");
	    }
	}

}
