package testCasePackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;

public class TC001_LocatorLearning extends BaseDriver {
	String baseUrl = "https://rahulshettyacademy.com/locatorspractice/";

	@Test
	public void locatorLearning() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.id("inputUsername")).sendKeys("Samiha");
		driver.findElement(By.name("inputPassword")).sendKeys("samiha123");
		
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//Formula:    tagname.value (if class is given)
		//			  tagname#value (if id is given)

		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		//Reset login
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("samihasumu");
		
		
		
		//Formula--->>  //tagname[@attribute='value']
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("bubtcse412@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("01754358357");
		Thread.sleep(2000);
		
		//click button cssSelector
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		//go to login 
		//click button xpath & go parent to child
		//formula --- /child tagname[1] number of line
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Samihaa");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		

	}
}
