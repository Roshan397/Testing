package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		WebElement feature=driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
		String text=feature.getText();
		System.out.println(text);
		
	}

}
