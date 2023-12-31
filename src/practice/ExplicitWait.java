package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			
			// Create WebElement for which we have to wait
			
			WebElement e1 = driver.findElement(By.xpath("//div[@class='_3skCyB']/descendant::input[1]"));
			
			// write explicit wait time for selenium to wait until the element is visible
			
			// We want driver to wait for 10 seconds
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			
			// when driver is waiting for 10 seconds, check if follwoing conditon is satisfied
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_3skCyB']/descendant::input[1]")));
			// If we are able to locate the element before 10 seconds, comeout of wait and conitnue execution
			
			
			// enter the mobile number on dialogue box
			
			e1.sendKeys("353454646");
			
			// click on cross button
			
			driver.findElement(By.xpath("//div[@class='JFPqaw']/descendant::span[1]")).click();

		}

	}

	


