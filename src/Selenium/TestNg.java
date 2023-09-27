package Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class TestNg {
	public static WebDriver dri = null;
@BeforeSuite
	public void beforeSuite() throws InterruptedException {
	System.setProperty("webdriver.chrome driver", "F:/EDUBRIDGE/chromedriver/chromedriver-win64/chromedriver.exe");
    dri = new ChromeDriver();
	Thread.sleep(1000);
	dri.get("https://www.upwork.com/resources/top-sites-for-online-education-and-learning");
	dri.manage().window().maximize();
}

@BeforeTest
public void beforeTest() {
//UpWork Signup
	
	dri.findElement(By.xpath("//*[@id=\"signup-1\"]")).click();
	dri.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div/div/div[1]/fieldset/div/div[2]/div")).click();
	dri.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div/div/div[2]/button")).click();
	dri.findElement(By.xpath("//*[@id=\"first-name-input\"]")).sendKeys("Ashifa");
	dri.findElement(By.xpath("//*[@id=\"last-name-input\"]")).sendKeys("Sherene");
	dri.findElement(By.xpath("//*[@id=\"redesigned-input-email\"]")).sendKeys("ashifasherene1591@gmail.com");
	dri.findElement(By.xpath("//*[@id=\"password-input\"]")).sendKeys("ashifa@123");
	dri.findElement(By.xpath("//*[@id=\"signupForm-redesigned\"]/fieldset/div[1]/label/small")).click();
	dri.findElement(By.xpath("//*[@id=\"signupForm-redesigned\"]/fieldset/div[2]/label/small")).click();
	dri.findElement(By.xpath("//*[@id=\"button-submit-form\"]")).click(); 
	dri.navigate().to("https://www.upwork.com/resources/top-sites-for-online-education-and-learning");		
}

@BeforeClass
public void beforeClass() throws IOException {
// Login
	String inputFilePath = "F://EDUBRIDGE/UpWork.xlsx"; // Input file
	 FileInputStream fileInputStream = new FileInputStream(inputFilePath);
    XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
    XSSFSheet sheet = workbook.getSheetAt(0);
    
    XSSFRow rowname = sheet.getRow(1);
    XSSFCell cellname = rowname.getCell(0);
    String email = cellname.getStringCellValue();
    
    XSSFRow rowpass = sheet.getRow(1);
    XSSFCell cellpass = rowpass.getCell(1);
    String password = cellpass.getStringCellValue();
    
	dri.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[2]/div[1]/a/div")).click();
	dri.findElement(By.xpath("//*[@id=\"login_username\"]")).sendKeys(email);
	dri.findElement(By.xpath("//*[@id=\"login_password_continue\"]")).click();
	
	WebElement login = new WebDriverWait(dri, Duration.ofSeconds(10))
			.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login_password\"]")));
	login.sendKeys(password);
	dri.findElement(By.xpath("//*[@id=\"login_control_continue\"]")).click(); 
	dri.navigate().to("https://www.upwork.com/resources/top-sites-for-online-education-and-learning");
}

@BeforeMethod
	public void beforeMethod() {
//Search box
		WebElement s = dri.findElement(By.xpath("//*[@id=\"app\"]/div/section/div[1]/form/input[2]"));
		s.sendKeys("java");
		s.submit();  
		dri.navigate().to("https://www.upwork.com/resources/top-sites-for-online-education-and-learning");
}
@Test
	public void testCase1() {
	//Reading Articles
			dri.findElement(By.xpath("//*[@id=\"w-dropdown-toggle-7\"]/div")).click();
			WebElement article = new WebDriverWait(dri, Duration.ofSeconds(10))
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"w-node-_995d769a-1e11-4ed3-f67e-38da1bec102e-90eb6f61\"]")));
			article.click();
			dri.findElement(By.xpath("//*[@id=\"w-node-_85558424-8eba-e6ef-1944-ec91166f5915-8d7f3c63\"]")).click();
			dri.navigate().to("https://www.upwork.com/resources/top-sites-for-online-education-and-learning");
 }

@AfterMethod
	public void afterMethod() {
	//Calculator tool for Youtube Money
			dri.findElement(By.xpath("//*[@id=\"w-dropdown-toggle-9\"]")).click();
			dri.findElement(By.xpath("//*[@id=\"w-node-_2508d385-6656-3997-a499-5cd188ae9079-90eb6f61\"]/div[2]")).click();
			dri.findElement(By.xpath("//*[@id=\"w-node-_718a2eb2-eb7c-d542-e59a-7caf66621182-0f7de6a7\"]/a")).click();
			dri.findElement(By.xpath("//*[@id=\"rpm\"]")).sendKeys("10");
			dri.findElement(By.xpath("//*[@id=\"dayViews\"]")).sendKeys("1000");  
			dri.findElement(By.xpath("//*[@id=\"w-node-f9bd4abc-dccb-b537-2c00-d9cbb18f22a1-d47de6ac\"]")).click();
}

/*@AfterClass
	public void afterClass() {
	
}
	

@AfterTest
	public void afterTest() {
		System.out.println("This will execute after the Test");
 }

 @AfterSuite
 	public void afterSuite() {
	 	System.out.println("This will execute after the Test Suite");
}*/
}

