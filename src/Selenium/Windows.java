package Selenium;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Windows {

	public static void main (String args[]) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "F:/EDUBRIDGE/chromedriver/chromedriver-win64/chromedriver.exe");
	WebDriver dri = new ChromeDriver();
//For DemoQA Website
	dri.get("https://demoqa.com/browser-windows");
	dri.findElement(By.id("windowButton")).click();
	
	String mainWindow = dri.getWindowHandle();
	Set<String> allWindows = dri.getWindowHandles();
	Iterator<String> iterator = allWindows.iterator();
	
	 while (iterator.hasNext()) {
         String ChildWindow = iterator.next();
             if (!mainWindow.equalsIgnoreCase(ChildWindow)) {
             dri.switchTo().window(ChildWindow);
         WebElement text = dri.findElement(By.id("sampleHeading"));
         System.out.println(text.getText());
             }
	 }
//For Amazon Website
/*	 dri.get("https://www.youtube.com/");
	 dri.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-mini-guide-renderer/div/ytd-mini-guide-entry-renderer[4]/a")).click();
	 
	 String mainWindow = dri.getWindowHandle();
	 Set<String> allWindows = dri.getWindowHandles();
	 Iterator<String> iterator = allWindows.iterator();
	 
	 while(iterator.hasNext()){
		 String ChildWindow = iterator.next();
         if (!mainWindow.equalsIgnoreCase(ChildWindow)) {
         dri.switchTo().window(ChildWindow); 
         
         WebElement text = dri.findElement(By.xpath("//*[@id=\"contents\"]/ytd-background-promo-renderer/div[1]/div"));
         System.out.println(text.getText());
         }
	 }*/
}
}
