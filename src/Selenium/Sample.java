package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sample {
		public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome driver","F:/EDUBRIDGE/chromedriver/chromedriver-win64/chromedriver.exe");
		WebDriver dri= new ChromeDriver();
		Thread.sleep(1000);
		String openurl="http://www.amazon.in/";
		dri.get(openurl);
// Getting Title 
		String title = dri.getTitle();
		System.out.println("Printing Title: "+  title);
		
// Getting Url
		String url= dri.getCurrentUrl();
		System.out.println("Current Url: "+ url);
//Getting WebPage Code
		String page= dri.getPageSource();
		System.out.println("Source Code:"+'\n'+ page);
		
//Checking whether the Url is correct
		String url1= dri.getCurrentUrl();
		System.out.println("Current Url: "+ url);		
// NAVIGATE
		dri.navigate().to("https://www.apple.com/in/?afid=p238%7Cs8Vs8GkTq-dc_mtid_187079nc38483_pcrid_664737674855_pgrid_112258962467_pntwk_g_pchan__pexid__&cid=aos-IN-kwgo-brand--slid---product-");
		dri.navigate().back();
		dri.navigate().forward();
		dri.navigate().refresh();
		
// IS DISPLAYED
		 WebElement searchBox = dri.findElement(By.id("twotabsearchtextbox"));
	        if (searchBox.isDisplayed()) {
	            System.out.println("Search Box is visible. Return: " + searchBox.isDisplayed());
	        } else {
	            System.out.println("Search Box is not visible. Return: " + searchBox.isDisplayed());
	        }
		
		dri.findElement(By.id("twotabsearchtextbox")). sendKeys("Kurta");
		dri.findElement(By.id("nav-search-submit-button")). click();
		dri.findElement(By.className("a-section a-spacing-base a-text-center")). click();

		dri.close();
	}
	}


