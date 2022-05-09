package com.runner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Lanched {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\eclipse\\MavenProj\\Chromeall\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		System.out.println("vision lanched");
		
		TakesScreenshot tkss = (TakesScreenshot) driver;
		
		File source = tkss.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\ELCOT\\Desktop\\eclipse\\MavenProj\\screenshots\\sc1.png");
		
		FileUtils.copyFile(source, destination);
		
		
	}

}
