package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3_d6 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("roshh@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("roshh23");
	    driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_Keyboard\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"user-registration-form-310\"]/form/div[2]/button")).click();
	    WebElement checkbox =driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_CPU i5 8th Gen\"]"));
	    if(!checkbox.isSelected())
	    {
	    	System.out.println("NotSelected");
	    }
	    Thread.sleep(5000);
	}

}
