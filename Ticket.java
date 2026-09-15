package book.show;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ticket {

	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub
		// Set ChromeDriver path
        

        // Open Chrome Browser
		//System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        // Maximize Window
        driver.manage().window().maximize();
        
        
        //driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.dominos.co.in//");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[text()='ORDER ONLINE NOW']")).click();
        Thread.sleep(4000);    
        //click skip
        driver.findElement(
        	    By.xpath("//span[text()='Skip']")
        	).click();
        
       Thread.sleep(3000);
       //click ask later
       driver.findElement(By.xpath("//span[normalize-space()='Ask Later']")).click();
       Thread.sleep(4000);
       //click don't allow
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       WebElement dontAllow = wait.until(
           ExpectedConditions.elementToBeClickable(
               By.id("moe-dontallow_button")
           )
       );

       dontAllow.click();
       Thread.sleep(3000);
       //click delivery now
       driver.findElement(By.xpath("//div[contains(@class,'order-type-btn')]")).click();
       Thread.sleep(3000);
       //location
       driver.findElement(
    		    By.xpath("//input[@placeholder='Search for your delivery location']")
    		).sendKeys("kadachanendhal");
       Thread.sleep(3000);
       Thread.sleep(5000);
        //click alagar kovil
       System.out.println(
       driver.findElements(
       By.xpath("//*[contains(text(),'Kadachanendhal')]")
       ).size()
       );
       WebElement address = wait.until(
    		    ExpectedConditions.elementToBeClickable(
    		        By.xpath("//p[contains(text(),'Alagar Kovil Main Road')]")
    		    )
    		);

    		address.click();

    		Thread.sleep(5000);
            //click confrim
    		System.out.println(driver.getCurrentUrl());
       Thread.sleep(5000);

       WebElement confirm = wait.until(
           ExpectedConditions.elementToBeClickable(
               By.xpath("//button[contains(@class,'btn--red')]")
           )
       );

       ((JavascriptExecutor) driver)
           .executeScript("arguments[0].click();", confirm);
         
       Thread.sleep(10000);
          //click chicken burst
       System.out.println(driver.getCurrentUrl());
       WebElement chicken = wait.until(
    		    ExpectedConditions.elementToBeClickable(
    		        By.xpath("//*[contains(text(),'Chicken Burst')]")
    		    )
    		);

    		((JavascriptExecutor)driver)
    		    .executeScript("arguments[0].click();", chicken);
    		
    		Thread.sleep(5000);
    		//add chicken maxx
    		WebElement title = driver.findElement(
    			    By.xpath("//*[contains(text(),'Chicken Maxxx - BBQ')]")
    			);

    			WebElement addBtn = title.findElement(
    			    By.xpath("./ancestor::div[contains(@class,'card-content')]//button")
    			);

    			((JavascriptExecutor)driver)
    			    .executeScript("arguments[0].click();", addBtn);
    			
    	
    			Thread.sleep(3000);
    			//click beverages
    			driver.findElement(
    				    By.xpath("//span[contains(text(),'Beverages')]")
    				).click();

    				Thread.sleep(3000);
                    //add coke
    				WebElement cokeAdd = driver.findElement(
    					    By.xpath("//span[contains(text(),'Coca Cola 475ml')]/ancestor::div[contains(@class,'card-size')]//button[contains(@class,'cta-add')]")
    					);

    					JavascriptExecutor js = (JavascriptExecutor) driver;
    					js.executeScript("arguments[0].click();", cokeAdd);
    			Thread.sleep(3000);
    			//add cart
    			driver.findElement(
    			    By.xpath("//span[contains(text(),'View Cart')]")
    			).click();
    			Thread.sleep(3000);
                //add address
    			driver.findElement(
        			    By.xpath("//span[contains(text(),'Add Address')]")
        			).click();
    			Thread.sleep(3000);
    			//add no
    			driver.findElement(By.id("BuildingNumber"))
    		      .sendKeys("65");
    			Thread.sleep(3000);
    			//add name
    			driver.findElement(By.id("Name"))
    		      .sendKeys("Aishwarya");
    			Thread.sleep(3000);
    			//enter  mobile number
    			driver.findElement(By.id("MobileNumber"))
    		      .sendKeys("9940789456");
    			Thread.sleep(3000);
    			//save address
    			driver.findElement(
        			    By.xpath("//span[contains(text(),'Save Address')]")
        			).click();
    			
	}

}
