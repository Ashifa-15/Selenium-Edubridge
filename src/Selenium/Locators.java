package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

			public static void main(String args[]) throws InterruptedException {
			System.setProperty("webdriver.chrome driver","F:/EDUBRIDGE/chromedriver/chromedriver-win64/chromedriver.exe");
			WebDriver dri= new ChromeDriver();
			Thread.sleep(1000);
			String openurl="https://www.youtube.com/";
			dri.get(openurl);
//Locators
/*			dri.findElement(By.xpath("//input[@id='search']")). sendKeys("Selenium");
			dri.findElement(By.cssSelector("button[class='style-scope ytd-searchbox']")). click();
			dri.findElement(By.linkText("Library")). click();
			dri.findElement(By.partialLinkText("Subscri")).click();*/
//Types of xpath
			dri.findElement(By.xpath("/html/body/div/ytd-mini-guide-entry-renderer/a/class")).click();
			dri.findElement(By.xpath("//a[@href='https://www.youtube.com/feed/library']")).click();
}
}