package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpathTypes {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome driver","F:/EDUBRIDGE/chromedriver/chromedriver-win64/chromedriver.exe");
		WebDriver dri= new ChromeDriver();
		Thread.sleep(1000);
		dri.get("http://www.amazon.in/");
		dri.findElement(By.xpath("/html/body/div/header/div/form/input/id")).sendKeys("flowers");
		//dri.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("flowers");
}
}