package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2_d6 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Roshan");
	    driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("Roshan@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Roshan");
	    WebElement datapick=driver.findElement(By.xpath("//*[@id=\"first_name_field\"]"));
	    WebElement datapick2=driver.findElement(By.xpath("//*[@id=\"user_email_field\"]"));
	    System.out.println(datapick.isDisplayed());
	    System.out.println(datapick2.isDisplayed());
	}

}
