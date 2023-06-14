package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_d6 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Rohan"); 
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("harun"); 
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("Rohs@gmail.com"); 
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("agskfyda"); 
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click(); 
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click(); 
		
		
		
	}

}
