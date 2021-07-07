package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {

	private static final WebDriver WebDriverRefrence = null;
	private static WebElement web_1;

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Chrome Driver2\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();

			 // Launch the application
		 driver.get("http://shareel:nf6gK$mH@54.168.116.22:8002/register/account");
   	 //driver.get("http://54.168.116.22:8002/register/account");
     	//zoom out
      	//JavascriptExecutor js = (JavascriptExecutor) driver;
      	//js.executeScript("document.body.style.zoom='60%'"); 
     	driver.manage().window().maximize();
    	
     	
		//Email Entry
     	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     	driver.findElement(By.id("user-email")).sendKeys("priotytest+10@gmail.com"); 
       //Password Entry
     	driver.findElement(By.id("user-password")).sendKeys("passworD1"); 
     	//Confirm Password
     	driver.findElement(By.id("user-confirm-password")).sendKeys("passworD1"); 
     	//User Name
     	driver.findElement(By.id("user-username")).sendKeys("Sumaiya Taz"); 
     	//Year Select
     	
     	Select dropdown = new Select(driver.findElement(By.id("user-dob_y")));
     	dropdown.selectByIndex(9);
     	//Month Select
     	Select dropdown1 = new Select(driver.findElement(By.id("user-dob_m")));
     	dropdown1.selectByIndex(9);
     	
     	//Date Select
     	Select dropdown2 = new Select(driver.findElement(By.id("user-dob_d")));
     	dropdown2.selectByIndex(9);
     	//CHeckbox 1 select
     	driver.findElement(By.className("checkmark")).click();
     	//radio button click
     	driver.findElement(By.cssSelector("div.page-wrapper div.account-register-page:nth-child(3) div.container div.account-register div.new-account-form form:nth-child(1) div.form-checkboxes div.form-input.checkbox.radio:nth-child(2) div.boxes.radio:nth-child(2) > label.input-checkbox.not-receive:nth-child(2)")).click();
     	//submit button click
     	driver.findElement(By.id("user-submit")).click(); 
     	
     	//Read From Second Page
     	//Email Check
    	String str = driver.findElement(By.id("show-user-email")).getText();
     	System.out.println(str);
     	//Nickname Check
     	String str1 = driver.findElement(By.id("show-user-nickname")).getText();
     	System.out.println(str1);
     	//Date Of Birth Check
     	String str2 = driver.findElement(By.id("show-user-dob-date")).getText();
     	System.out.println(str2);
   
     	
     	//Wait Function
     	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	//Quit Browser
     	//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     	//driver.quit(); 
     	//Login
     	
        driver.get("http://54.168.116.22:8002/login");
        //driver.navigate().refresh();
      
    	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("priotytest+10@gmail.com");
     	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("passworD1");
     	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/button[1]")).click();
	
 
     	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     	
   /*  	String url = "http://54.168.116.22:8002/login";
       driver.get(url);
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         //get current URL and print
      String strUrl = driver.getCurrentUrl();
       System.out.println("Current Url is:"+ strUrl); */
	
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     	 //zoom out
      	//JavascriptExecutor js = (JavascriptExecutor) driver;
      	//.executeScript("document.body.style.zoom='60%'"); 
        //Question Answer 1
     	Thread.sleep(10000);
        driver.findElement(By.cssSelector("div.page-wrapper div.survey-page.second-design:nth-child(3) div.container form.survey-content-wrapper div.survey-item.slider-item:nth-child(4) div.question-item div.question-list:nth-child(2) div.answer-wrapper div.question-answer:nth-child(10) > label:nth-child(2)")).click();
        //Question Answer 2
        driver.findElement(By.cssSelector("div.page-wrapper div.survey-page.second-design:nth-child(3) div.container form.survey-content-wrapper div.survey-item.slider-item:nth-child(4) div.question-item div.question-list:nth-child(3) div.answer-wrapper div.question-answer:nth-child(10) > label:nth-child(2)")).click();
      //Question Answer 3
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("div.page-wrapper div.survey-page.second-design:nth-child(3) div.container form.survey-content-wrapper div.survey-item.slider-item:nth-child(5) div.question-item div.question-list:nth-child(2) div.answer-wrapper div.question-answer:nth-child(9) > label:nth-child(2)")).click();
        //Question Answer 4
        driver.findElement(By.cssSelector("div.page-wrapper div.survey-page.second-design:nth-child(3) div.container form.survey-content-wrapper div.survey-item.slider-item:nth-child(5) div.question-item div.question-list:nth-child(3) div.answer-wrapper div.question-answer:nth-child(9) > label:nth-child(2)")).click();
        //Question Answer 5
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("div.page-wrapper div.survey-page.second-design:nth-child(3) div.container form.survey-content-wrapper div.survey-item.slider-item:nth-child(6) div.question-item div.question-list:nth-child(2) div.answer-wrapper div.question-answer:nth-child(8) > label:nth-child(2)")).click();
        //Question Answer 6
        driver.findElement(By.cssSelector("div.page-wrapper div.survey-page.second-design:nth-child(3) div.container form.survey-content-wrapper div.survey-item.slider-item:nth-child(6) div.question-item div.question-list:nth-child(3) div.answer-wrapper div.question-answer:nth-child(8) > label:nth-child(2)")).click();
      //Question Answer 7
        driver.findElement(By.cssSelector("div.page-wrapper div.survey-page.second-design:nth-child(3) div.container form.survey-content-wrapper div.survey-item.slider-item:nth-child(7) div.question-item div.question-list:nth-child(2) div.answer-wrapper div.question-answer:nth-child(7) > label:nth-child(2)")).click();
        //Question Answer 8
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("div.page-wrapper div.survey-page.second-design:nth-child(3) div.container form.survey-content-wrapper div.survey-item.slider-item:nth-child(7) div.question-item div.question-list:nth-child(3) div.answer-wrapper div.question-answer:nth-child(7) > label:nth-child(2)")).click();
      //Question Answer 9
        driver.findElement(By.cssSelector("div.page-wrapper div.survey-page.second-design:nth-child(3) div.container form.survey-content-wrapper div.survey-item.slider-item:nth-child(8) div.question-item div.question-list:nth-child(2) div.answer-wrapper div.question-answer:nth-child(6) > label:nth-child(2)")).click();
        //Question Answer 10
        driver.findElement(By.cssSelector("div.page-wrapper div.survey-page.second-design:nth-child(3) div.container form.survey-content-wrapper div.survey-item.slider-item:nth-child(8) div.question-item div.question-list:nth-child(3) div.answer-wrapper div.question-answer:nth-child(6) > label:nth-child(2)")).click();
      //Question Answer 11
        driver.findElement(By.cssSelector("div.page-wrapper div.survey-page.second-design:nth-child(3) div.container form.survey-content-wrapper div.survey-item.slider-item:nth-child(9) div.question-item div.question-list:nth-child(2) div.answer-wrapper div.question-answer:nth-child(5) > label:nth-child(2)")).click();
        //Question Answer 12
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("div.page-wrapper div.survey-page.second-design:nth-child(3) div.container form.survey-content-wrapper div.survey-item.slider-item:nth-child(9) div.question-item div.question-list:nth-child(3) div.answer-wrapper div.question-answer:nth-child(5) > label:nth-child(2)")).click();
        //Question Answer 13
        driver.findElement(By.cssSelector("div.page-wrapper div.survey-page.second-design:nth-child(3) div.container form.survey-content-wrapper div.survey-item.slider-item:nth-child(10) div.question-item div.question-list:nth-child(2) div.answer-wrapper div.question-answer:nth-child(4) > label:nth-child(2)")).click();
        //Question Answer 14
        driver.findElement(By.cssSelector("div.page-wrapper div.survey-page.second-design:nth-child(3) div.container form.survey-content-wrapper div.survey-item.slider-item:nth-child(10) div.question-item div.question-list:nth-child(3) div.answer-wrapper div.question-answer:nth-child(4) > label:nth-child(2)")).click();
      //Question Answer 15
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("div.page-wrapper div.survey-page.second-design:nth-child(3) div.container form.survey-content-wrapper div.survey-item.slider-item:nth-child(11) div.question-item div.question-list:nth-child(2) div.answer-wrapper div.question-answer:nth-child(3) > label:nth-child(2)")).click();
        //Question Answer 16
        driver.findElement(By.cssSelector("div.page-wrapper div.survey-page.second-design:nth-child(3) div.container form.survey-content-wrapper div.survey-item.slider-item:nth-child(11) div.question-item div.question-list:nth-child(3) div.answer-wrapper div.question-answer:nth-child(3) > label:nth-child(2)")).click();	
     
         
        //Declaration
        Thread.sleep(10000);
        driver.findElement(By.id("user-survey-declaration")).sendKeys("Test Survey Answer");
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
        WebDriverWait wait = new WebDriverWait (driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#user-survey-submit-backup"))).click();
        
        
	} }


