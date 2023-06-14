package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,3000)","");
		driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[2]/a")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[2]/a")).click();
		
	}

}
