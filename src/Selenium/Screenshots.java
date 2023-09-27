package Selenium;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Screenshots {
	public static void main (String args[]) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome driver", "F:/EDUBRIDGE/chromedriver/chromedriver-win64/chromedriver.exe");
	WebDriver dri = new ChromeDriver();
	dri.get("https://demoqa.com/buttons");
	
//Screenshot of a page 
	File PageScr = ((TakesScreenshot) dri).getScreenshotAs(OutputType.FILE);
	File PageDest = new File("./Pic/img1.png");
	FileHandler.copy(PageScr, PageDest);
	
	
//Screenshot of an Element
	WebElement Ele = dri.findElement(By.id("doubleClickBtn"));
	File EleScr = ((TakesScreenshot) Ele).getScreenshotAs(OutputType.FILE);
	File EleDest = new File("./Pic/img2.png");
	FileHandler.copy(EleScr, EleDest);

//ScreenShot of a Section
	WebElement Eleme = dri.findElement(By.className("left-pannel"));
	File SecScr = ((TakesScreenshot) Eleme).getScreenshotAs(OutputType.FILE);
	File SecDest = new File("./Pic/img3.png");
	FileHandler.copy(SecScr, SecDest);
	
	dri.quit();
}
}
