package Selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome driver", "F:/EDUBRIDGE/chromedriver/chromedriver-win64/chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("https://demoqa.com/alerts");
		Alert simpleAlert = dri.switchTo().alert();
		String alertText = simpleAlert.getText();
		System.out.println("SIMPLE ALERT TEXT: "+alertText);
		simpleAlert.accept();

	}

}
