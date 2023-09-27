package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectProgram {
	public static void main (String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/EDUBRIDGE/chromedriver/chromedriver-win64/chromedriver.exe");
		WebDriver dri= new ChromeDriver();
		dri.get("https://demoqa.com/select-menu");
		Select se = new Select(dri.findElement(By.xpath("//select[@id='oldSelectMenu']")));
		se.selectByIndex(1); //Blue
		se.selectByValue("4"); //Purple
		se.selectByVisibleText("Aqua");
	}
	}


