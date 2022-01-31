package test;

import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterForm {
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	private String projectPath = System.getProperty("user.dir");

	  @BeforeTest()
	  public void setUp() throws Exception {
		  System.setProperty("webdriver.chrome.driver", projectPath +"//drivers/chromedriver/chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	  
	  @Test
	  public void testUntitledTestCase() throws Exception {
	    driver.get("https://userinyerface.com/");
	    driver.findElement(By.linkText("HERE")).click();
	    driver.findElement(By.xpath("//input[@type='text']")).click();
	    driver.findElement(By.xpath("//input[@type='text']")).clear();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234567_Abc");
	    driver.findElement(By.cssSelector("input[placeholder='Your email']")).click();
	    driver.findElement(By.cssSelector("input[placeholder='Your email']")).clear();
	    driver.findElement(By.cssSelector("input[placeholder='Your email']")).sendKeys("alvaro");
	    driver.findElement(By.cssSelector("input[placeholder='Domain']")).click();
	    driver.findElement(By.cssSelector("input[placeholder='Domain']")).clear();
	    driver.findElement(By.cssSelector("input[placeholder='Domain']")).sendKeys("mail");
	    driver.findElement(By.cssSelector(".dropdown__field")).click();
	    driver.findElement(By.cssSelector("div[class='dropdown__list'] div:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".checkbox__box")).click();
	    driver.findElement(By.linkText("Next")).click();
	    	 
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	  }
	  
	  @AfterTest()
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

}
