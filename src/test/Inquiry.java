package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Inquiry {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome Driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

         // Launch the application
     	 driver.get("http://shareel:nf6gK$mH@54.168.116.22:8002/item/1/inquiry");
     	 
     	driver.manage().window().maximize();
     	//JavascriptExecutor js = (JavascriptExecutor) driver;
     	//js.executeScript("document.body.style.zoom='60%'");
		//Submit button click 	
     	WebElement element = driver.findElement(By.id("user-iquiry-button"));
     	JavascriptExecutor executor = (JavascriptExecutor)driver;
     	executor.executeScript("arguments[0].click();", element);	
     	//Alert For Empty Name
     	WebElement msg1=driver.findElement(By.tagName("p"));
     	String text1=msg1.getText();
     	if (msg1.isEnabled() && text1.contains("『質問内容』に記入されてません。再度ご確認ください。"))
     	{ 
     	    System.out.println("Successfully got Alert empty name ");
     	}else{
     	    System.out.println("Didn't got Alert");
     	}
     //Alert For Empty Email
     	WebElement msg2=driver.findElement(By.cssSelector("div.page-wrapper div.inner-page:nth-child(3) div.container div.page-wrapper form.password-mail-wrapper > p.error-message-box:nth-child(6)"));
     	String text2=msg2.getText();
     	if (msg2.isEnabled() && text2.contains("有効なメールアドレスを入力してください"))
     	{ 
     	    System.out.println("Successfully got Alert empty email ");
     	}else{
     	    System.out.println("Didn't got Alert");
     	}
     //Alert For Empty Content 
     	WebElement msg3=driver.findElement(By.cssSelector("div.page-wrapper div.inner-page:nth-child(3) div.container div.page-wrapper form.password-mail-wrapper > p.error-message-box:nth-child(7)"));
     	String text3=msg3.getText();
     	if (msg3.isEnabled() && text3.contains("『お名前』に記入されてません。再度ご確認ください。"))
     	{ 
     	    System.out.println("Successfully got Alert empty Content ");
     	}else{
     	    System.out.println("Didn't got Alert");
     	}	
 //Name Input
     	driver.findElement(By.tagName("input")).sendKeys("Sumaiya"); 
 //Email Input
     	driver.findElement(By.cssSelector("div.page-wrapper div.inner-page:nth-child(3) div.container div.page-wrapper form.password-mail-wrapper div.form-input:nth-child(3) > input.input-text.is-invalid:nth-child(2)")).sendKeys("sumaiya@anysense.co.jp"); 
     	//Content
     	driver.findElement(By.tagName("textarea")).sendKeys("test"); 
     	//wait
    	//Thread.sleep(9000);
     	
     //Button Click
    WebDriverWait wait = new WebDriverWait(driver, 15);

     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-iquiry-button"))).click();
     
     //Alert For Providing text less than 5
  	WebElement msg4=driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[2]/div[1]/div[1]/form[1]/p[1]"));
  	String text4=msg4.getText();
  	if (msg4.isEnabled() && text4.contains("コンテンツフィールドに5文字以上入力してください"))
  	{ 
  	    System.out.println("Successfully got Alert For Providing Content less than 5 ");
  	}else{
  	    System.out.println("Didn't got Alert");
  	}	
  
 	//Content give
 	driver.findElement(By.tagName("textarea")).sendKeys("アプデでは、専門家のプロフェッショナルサービスをご利用いただくにあたり、より利便性が高く、ユーザの皆様によりご満足い"); 
 	
 	//Submit Button Click
 	driver.findElement(By.id("user-iquiry-button")).click();
 	//Confirm page Data Check
 	//Name check
 	Thread.sleep(9000);
 	WebElement msg5=driver.findElement(By.cssSelector("div.page-wrapper div.inner-page:nth-child(3) div.container div.page-wrapper form.password-mail-wrapper div.form-input:nth-child(1) > div.form-text:nth-child(2)"));
 	String text5=msg5.getText();
 	if (msg5.isEnabled() && text5.contains("Sumaiya"))
 	{ 
 	    System.out.println("Name Data is available in Confirm Page");
 	}else{
 	    System.out.println("Name Data not available");
 	}
 	//Email check
 	
 	String str = driver.findElement(By.id("inquiry-confirm-page-email")).getText();
 	System.out.println(str);
 	//Content Check
 	String str1 = driver.findElement(By.id("inquiry-confirm-page-content")).getText();
 	System.out.println(str1);
 	
 	//Confirm Button Click
 	driver.findElement(By.id("user-inquiry-confirm-btn")).click();
 	
 	//Complete Page Check
 	Thread.sleep(9000);
 	String str2 = driver.findElement(By.id("inquiry-complete-inquiry-id")).getText();
 	System.out.println(str2);
 	//Redirect to homepage
 	driver.findElement(By.id("user-inquiry-complete-btn")).click();
 	//Return Button Check
 	Thread.sleep(9000);
 	String actualUrl="http://54.168.116.22:8002/item/1";
    String expectedUrl= driver.getCurrentUrl();
    
    if(actualUrl.equalsIgnoreCase(expectedUrl))
    {
        System.out.println("Successfully redirected to Adviser Profile");
    }
    else
    {
        System.out.println("Failed");
        
} }}
