package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2_d5 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		String s=driver.getCurrentUrl();
		if(s.equals("https://j2store.net/free/"))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)", "");
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		String s1=driver.getCurrentUrl();
		if(s1.equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}

}
