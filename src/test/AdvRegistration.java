package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver; 
public class AdvRegistration {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Chrome Driver2\\chromedriver.exe");
		driver = new ChromeDriver();
		

		 // Launch the application
		 driver.get("http://shareel:nf6gK$mH@54.168.116.22:8002/adviser/register");
   	 
     	
     	driver.manage().window().maximize();
    	
     	
		//Email Entry
     	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     	driver.findElement(By.id("adviser-register-email")).sendKeys("priotytest+21@gmail.com"); 
       //Password Entry
     	driver.findElement(By.id("adviser-register-password")).sendKeys("passworD1"); 
     	//Confirm Password
     	driver.findElement(By.id("adviser-register-confrimation-password")).sendKeys("passworD1"); 
     	//User Name
     	driver.findElement(By.id("adviser-register-username")).sendKeys("Adviser Sumaiya"); 
     	//Year Select
     	
     	Select dropdown = new Select(driver.findElement(By.id("adviser-register-dob_y")));
     	dropdown.selectByIndex(9);
     	//Month Select
     	Select dropdown1 = new Select(driver.findElement(By.id("adviser-register-dob_m")));
     	dropdown1.selectByIndex(9);
     	
     	//Date Select
     	Select dropdown2 = new Select(driver.findElement(By.id("adviser-register-dob_d")));
     	dropdown2.selectByIndex(9);
     	//CHeckbox 1 select
     	driver.findElement(By.className("checkmark")).click();
     	
     	//submit button click
     	driver.findElement(By.id("adviser-register-basic-submit")).click(); 
     	
 //Second Page Document Upload
   	
     Thread.sleep(5000);
     	//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     Actions act= new Actions(driver);
     WebElement chooseFile=driver.findElement(By.id("adviser-register-document-upload"));
     act.moveToElement(chooseFile).click().perform();
     Thread.sleep(2000);
     uploadFile("E:\\Test\\New.jpg");
     
  	
	}
	
    
    public static void setClipBoard(String file) {
     StringSelection obj= new StringSelection(file);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
    }
    
    public static void uploadFile(String filePath) throws AWTException, InterruptedException {
     setClipBoard(filePath);
     Robot rb= new Robot();
     rb.keyPress(KeyEvent.VK_CONTROL);
     rb.keyPress(KeyEvent.VK_V);
     rb.keyRelease(KeyEvent.VK_CONTROL);
     rb.keyRelease(KeyEvent.VK_V);
     rb.keyPress(KeyEvent.VK_ENTER);
     rb.keyRelease(KeyEvent.VK_ENTER);	
   //Wait Function
  Thread.sleep(10000);
   
     driver.findElement(By.cssSelector("#adviser-register-document-submit")).click(); 
	//3rd page
 	//Bank Select
 	//Select dropdown = new Select(driver.findElement(By.id("adviser-register-bankname")));
 	//dropdown.selectByIndex(2);
     WebElement contractType = driver.findElement(By.id("adviser-register-bankname"));

     Select dropdownField = new Select(contractType);
     dropdownField.selectByVisibleText("Brac Bank");
 	//Account Number
 	driver.findElement(By.id("adviser-register-acc_num")).sendKeys("1234567890"); 
 	//Account Name
 	driver.findElement(By.id("adviser-register-acc_name")).sendKeys("Sumaiya Taz"); 
 	//Account Type
 	 	driver.findElement(By.id("adviser-register-acc_type")).sendKeys("Salary Account"); 
 	//Branch Number
 	 	driver.findElement(By.id("adviser-register-branch_num")).sendKeys("123456");
 	 //Branch Name
 	 	driver.findElement(By.id("adviser-register-branch_name")).sendKeys("Mirpur");
 	 	 //Wait Function
 	 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 	    
 	//submit button click
 	   driver.findElement(By.cssSelector("#adviser-register-account_submit")).click(); 
 	//Final Submit button click
 	 Thread.sleep(3000);
 
 	  driver.findElement(By.cssSelector("#adviser-register-confirm-submit-backup")).click(); 
 	  //Completed page button click
 	 Thread.sleep(3000);
 	 driver.findElement(By.id("adviser-register-completed_page")).click(); 
 	 //Login button click
 	 driver.findElement(By.linkText("ログイン")).click();
//Email Input
 	//Wait Function
 	  //Thread.sleep(3000);
 	
 	// driver.get("http://shareel:nf6gK$mH@54.168.116.22:8002/adviser/login");
 	
 	 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("priotytest+21@gmail.com");
 	 //Password
 	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("passworD1");
 	//Submit Button
 	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/button[1]")).click();
 	//logout
	WebElement titleA = driver.findElement(By.cssSelector("div.page-wrapper div.container:nth-child(3) div.layout_wrapper aside:nth-child(1) div.sidebar_area div.logout-area > button.logout-btn"));
    // Create an object of actions class and pass reference of WebDriver as a parameter to its constructor. 
       Actions actions = new Actions(driver); 
    // Call moveToElement() method of actions class to move mouse cursor to a WebElement A. 
       actions.moveToElement(titleA); 
       actions.clickAndHold(); 
       actions.release().perform(); 
       //
       driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/aside[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[2]")).click();
       //Back To Homepage
       driver.findElement(By.cssSelector("div.page-wrapper div.logout-page:nth-child(2) div.container div.inner-page-wrapper > a.back-to-top.nuxt-link-active")).click(); 
    }
    
}

	
