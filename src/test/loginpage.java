package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class loginpage {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

         // Launch the application
     	 driver.get("http://54.168.116.22:8002/login");
     	 
     	driver.manage().window().maximize();
			
		//Step-1 Check for empty password & Email
    
     	
     	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/button[1]")).click();
     	
     	
     	//Alert For Empty email
     	WebElement msg=driver.findElement(By.tagName("p"));
     	String text=msg.getText();
     	if (msg.isEnabled() && text.contains("メールアドレスを入力してください"))
     	{ 
     	    System.out.println("Successfully got message for empty email ");
     	}else{
     	    System.out.println("Didn't got message");
     	}
     	//Alert For Empty password
     	WebElement msg1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/p[2]"));
     	String text1=msg1.getText();
     	if (msg1.isEnabled() && text1.contains("パスワードの長さは8文字以上、16文字以下にする必要があります。"))
     	{ 
     	    System.out.println("Successfully got message empty password ");
     	}else{
     	    System.out.println("Didn't got message");
     	}
     	//Wait
     	Thread.sleep(8000);
     	
     	//Refresh
     	driver.navigate().refresh();
     	
     	
     	//Case sensitive email & Successfully login check
     	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("SHAREEL+client@gmail.com");
     	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("passwordD1");
     	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/button[1]")).click();
     /*	Robot robot = new Robot();
		System.out.println("About to zoom out");
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
		} */
		Thread.sleep(10000);
		 
		String actualUrl="http://54.168.116.22:8002/user";
        String expectedUrl= driver.getCurrentUrl();
        
        if(actualUrl.equalsIgnoreCase(expectedUrl))
        {
            System.out.println("Successfully Login");
        }
        else
        {
            System.out.println("Login Failed");
        }
      //Wait
     	Thread.sleep(10000);
      //Logout
     	WebDriverWait wait = new WebDriverWait(driver, 15);

     	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-logout-button")));
        //Logout button click
     	WebElement titleA = driver.findElement(By.id("user-logout-button"));
     // Create an object of actions class and pass reference of WebDriver as a parameter to its constructor. 
        Actions actions = new Actions(driver); 
     // Call moveToElement() method of actions class to move mouse cursor to a WebElement A. 
        actions.moveToElement(titleA); 
        actions.clickAndHold(); 
        actions.release().perform(); 
        //
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/aside[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/button[2]")).click();
       
        
       
      
	  } 
	} 
	
	
	


